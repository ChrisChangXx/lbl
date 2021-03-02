package com.chris.springaop.test;

import com.chris.springaop.app.AppConfig;
import com.chris.springaop.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        /*CityEntity cityEntity = new CityEntity();
        cityEntity.setId("1");
        cityEntity.setName("beijing");
        System.out.println(CommonUtil.build(cityEntity));*/
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        IndexDao dao = annotationConfigApplicationContext.getBean(IndexDao.class);
        dao.print();
    }
}
