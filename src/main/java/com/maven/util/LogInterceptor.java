//package com.maven.util;
//
//import org.aspectj.lang.annotation.*;
//import org.springframework.stereotype.Component;
//
///**
// * Created with IntelliJ IDEA.
// * Description: https://www.cnblogs.com/oumyye/p/4480196.html
// * User: headean
// * Email: 386495531@qq.com
// * Date: 2020-04-14 16:50
// */
////@Aspect
////@Component
//public class LogInterceptor {
//    @Pointcut("execution(public * com.maven.service..*.save(..))")
//    public void myMethod(){};
//
//    /*@Before("execution(public void com.oumyye.dao.impl.UserDAOImpl.save(com.oumyye.model.User))")*/
//    @Before("myMethod()")
//    public void before() {
//        System.out.println("method start");
//    }
//    @After("myMethod()")
//    public void after() {
//        System.out.println("method after");
//    }
//    @AfterReturning("execution(public * com.maven.dao..*.*(..))")
//    public void AfterReturning() {
//        System.out.println("method AfterReturning");
//    }
//    @AfterThrowing("execution(public * com.maven.dao..*.*(..))")
//    public void AfterThrowing() {
//        System.out.println("method AfterThrowing");
//    }
//}
