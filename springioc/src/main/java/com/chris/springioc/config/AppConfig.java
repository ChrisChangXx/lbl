package com.chris.springioc.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * @author zhangh
 */
@Configuration
@ComponentScan("com.chris.springioc")
public class AppConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(){
        return new SqlSessionFactoryBean();
    }
}
