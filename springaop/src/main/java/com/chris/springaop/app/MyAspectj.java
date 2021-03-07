package com.chris.springaop.app;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author zhangh
 */
@Component
@Aspect("perthis(this(com.chris.springaop.dao.IndexDao))")
@Scope("prototype")
public class MyAspectj {

    /*@DeclareParents(value = "com.chris.springaop.dao.*", defaultImpl = TestDao.class)
    public static Dao dao;*/


    @Pointcut("execution(* com.chris.springaop.dao.*.*(..))")
    public void pointCutExecution() {

    }

    @Pointcut("within(com.chris.springaop.dao.*)")
    public void pointCutWithin() {

    }

    @Pointcut("this(com.chris.springaop.dao.IndexDao)")
    public void pointCutThis(){

    }

    /*@Before("pointCutWithin()")
    public void before(JoinPoint joinPoint) {
        System.out.println("before");
        System.out.println(joinPoint.getThis());
        System.out.println(joinPoint.getTarget());
    }

    @After("pointCutWithin()")
    public void after(){
        System.out.println("after");
    }*/

    @Around("pointCutWithin()")
    public void around(ProceedingJoinPoint pjp) {
        System.out.println(hashCode());
        System.out.println("around-before");
        Object[] args = pjp.getArgs();
        if (args != null && args.length > 0){
            args[0] += " world";
        }
        try {
            pjp.proceed(args);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around-after");
    }
}
