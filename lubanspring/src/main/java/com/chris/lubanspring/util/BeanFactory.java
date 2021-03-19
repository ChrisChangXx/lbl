package com.chris.lubanspring.util;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BeanFactory {

    Map<String, Object> map = new HashMap();

    public BeanFactory(String xml) {
        parseXml(xml);
    }

    public void parseXml(String xml) {
        File file = new File(this.getClass().getResource("/").getPath() + xml);
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(file);
            Element elementRoot = document.getRootElement();
            Attribute attribute = elementRoot.attribute("default");
            boolean flag = false;
            if (attribute != null) {
                flag = true;
            }
            for (Iterator<Element> itFirst = elementRoot.elementIterator(); itFirst.hasNext(); ) {
                //实例化对象
                Element elementFirstChild = itFirst.next();
                Attribute attributeId = elementFirstChild.attribute("id");
                String beanName = attributeId.getValue();
                Attribute attributeClazz = elementFirstChild.attribute("class");
                String clazzName = attributeClazz.getValue();
                Class clazz = Class.forName(clazzName);

                //维护依赖关系
                //看这个对象有没有依赖（判断是否有property，或者判断是否有属性）
                //如果有则注入
                Object object = null;
                for (Iterator<Element> itSecond = elementFirstChild.elementIterator(); itSecond.hasNext(); ) {
                    //得到ref的value，通过value得到对象（map）
                    //得到name的值，然后根据值获取一个filed的对象
                    //通过filed的set方法set那个对象
                    //<property name = "dao" ref = "dao"></property>
                    Element elementSecondChild = itSecond.next();
                    if (elementSecondChild.getName().equals("property")) {
                        //由于是setter，没有特殊的构造方法
                        object = clazz.newInstance();
                        String refValue = elementSecondChild.attributeValue("ref");
                        Object injectObject = map.get(refValue);
                        String nameValue = elementSecondChild.attributeValue("name");
                        Field field = clazz.getDeclaredField(nameValue);
                        field.setAccessible(true);
                        field.set(object, injectObject);
                    } else {
                        //说明有构造方法
                        String refValue = elementSecondChild.attributeValue("ref");
                        Object injectObject = map.get(refValue);
                        Class injectObjectClazz = injectObject.getClass();
                        Constructor constructor = clazz.getConstructor(injectObjectClazz.getInterfaces()[0]);
                        object = constructor.newInstance(injectObject);
                    }
                }

                if (object == null) {
                    if (flag) {
                        if (attribute.getValue().equals("byType")) {
                            //判读是否有依赖
                            Field[] fields = clazz.getDeclaredFields();
                            for (Field field : fields) {
                                //得到属性的依赖，比如String aa那么得到的就是String.class
                                Class injectObjectClazz = field.getType();
                                //由于是byType所以需要遍历map当中的所有对象 判断对象的类型是否和injectObjectClazz的类型相同
                                int count = 0;
                                Object injectObject = null;
                                for (String key : map.keySet()) {
                                    Class temp = map.get(key).getClass().getInterfaces()[0];
                                    if (temp.getName().equals(injectObjectClazz.getName())) {
                                        //记录找到一个，因为可能找到多个
                                        injectObject = map.get(key);
                                        count++;
                                    }
                                }

                                if (count > 1) {
                                    throw new LubanSpringException("需要一个对象，但是找到了两个对象");
                                } else {
                                    object = clazz.newInstance();
                                    field.setAccessible(true);
                                    field.set(object, injectObject);
                                }
                            }
                        }
                    }
                }

                if (object == null) {
                    //没有子标签
                    object = clazz.newInstance();
                }
                map.put(beanName, object);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object getBean(String beanName) {
        return map.get(beanName);
    }
}
