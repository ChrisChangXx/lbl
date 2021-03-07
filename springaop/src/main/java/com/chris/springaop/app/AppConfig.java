package com.chris.springaop.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zhangh
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = false)
@ComponentScan("com")
public class AppConfig {
}
