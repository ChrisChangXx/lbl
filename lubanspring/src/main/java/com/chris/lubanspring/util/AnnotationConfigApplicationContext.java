package com.chris.lubanspring.util;

import com.chris.lubanspring.anno.Luban;

import java.io.File;
import java.lang.annotation.Annotation;

/**
 * @创建人 zhanghui
 * @创建时间 2021/3/21
 * @描述
 */
public class AnnotationConfigApplicationContext {
    public void scan(String basePackage) {
        String rootPath = this.getClass().getResource("/").getPath();
        System.out.println(rootPath);
        String basePackagePath = basePackage.replaceAll("\\.", "\\\\");
        System.out.println(basePackagePath);
        File file = new File(rootPath + "//" + basePackagePath);
        String[] names = file.list();
        for (String name : names) {
            name = name.replaceAll(".class", "");
            try {
                Class clazz = Class.forName(basePackage + "." + name);
                if (clazz.isAnnotationPresent(Luban.class)) {
                    Luban luban = (Luban) clazz.getAnnotation(Luban.class);
                    System.out.println(luban.value());
                    System.out.println(clazz.newInstance());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
