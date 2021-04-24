package com.chris.springlog.test;

import com.chris.springlog.config.AppConfig;
import com.chris.springlog.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @创建人 zhanghui
 * @创建时间 2021/4/3
 * @描述
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        annotationConfigApplicationContext.start();
        annotationConfigApplicationContext.getBean(IndexService.class).query();
    }
}
