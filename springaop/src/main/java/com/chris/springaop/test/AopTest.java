package com.chris.springaop.test;

import com.chris.springaop.app.AppConfig;
import com.chris.springaop.dao.Dao;
import com.chris.springaop.dao.IndexDao;
import com.chris.springaop.dao.OrderDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        /*CityEntity cityEntity = new CityEntity();
        cityEntity.setId("1");
        cityEntity.setName("beijing");
        System.out.println(CommonUtil.build(cityEntity));*/
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Dao dao = annotationConfigApplicationContext.getBean(IndexDao.class);
        Dao dao1 = annotationConfigApplicationContext.getBean(IndexDao.class);
        dao.query1("hello");
        dao1.query1("hello2");
    }
}
