package com.chris.springaop.app;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author zhangh
 */
@Component
@Aspect
public class MyAspectj {

    @Pointcut("execution(* com.chris.springaop.dao.*.*(..))")
    public void pointCutExecution() {

    }

    @Pointcut("within(com.chris.springaop.dao.*)")
    public void pointCutWithin() {

    }

    @Before("pointCutWithin()")
    public void before() {
        System.out.println("before");
    }
}
