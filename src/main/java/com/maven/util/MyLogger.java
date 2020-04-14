package com.maven.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: https://blog.csdn.net/qq_32588349/article/details/51557143
 *              增强类代码
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2020-04-14 17:59
 */
@Aspect
@Component
public class MyLogger {
    //private Logger logger = Logger.getLogger(String.valueOf(MyLogger.class));
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**前置增强方法*/
    public void beforeLogger(JoinPoint jp) {
        logger.info("这是MyLogger类的before方法！");
        System.out.println("切入点方法入参列表：" + Arrays.toString(jp.getArgs()));
        System.out.println("切入点方法签名对象：" + jp.getSignature());
        System.out.println("切入点所在目标对象：" + jp.getTarget());
        System.out.println("代理对象本身：" + jp.getThis());
    }

    /**后置增强方法*/
    public void afterReturning(JoinPoint jp, Object result) {
        logger.info("这是MyLogger类的after-returning方法！");
        System.out.println("切入点方法入参列表：" + Arrays.toString(jp.getArgs()));
        System.out.println("切入点方法签名对象：" + jp.getSignature());
        System.out.println("切入点所在目标对象：" + jp.getTarget());
        System.out.println("代理对象本身：" + jp.getThis());
        System.out.println("切入点方法返回对象：" + result);
    }

    /**后置异常增强方法*/
    public void afterThrowing(JoinPoint jp, Exception e) {
        logger.info("这是MyLogger类的after-Throwing方法！");
        System.out.println("切入点方法入参列表：" + Arrays.toString(jp.getArgs()));
        System.out.println("切入点方法签名对象：" + jp.getSignature());
        System.out.println("切入点所在目标对象：" + jp.getTarget());
        System.out.println("代理对象本身：" + jp.getThis());
        System.out.println("异常：" + e);
    }

    /**最终增强方法*/
    public void after(JoinPoint jp) {
        logger.info("这是MyLogger类的after方法！");
        System.out.println("切入点方法入参列表：" + Arrays.toString(jp.getArgs()));
        System.out.println("切入点方法签名对象：" + jp.getSignature());
        System.out.println("切入点所在目标对象：" + jp.getTarget());
        System.out.println("代理对象本身：" + jp.getThis());
    }

    /**环绕增强方法*/
    public void aroundLogger(ProceedingJoinPoint jp) {
        logger.info("这是MyLogger类的around方法！");
        System.out.println("切入点方法入参列表：" + Arrays.toString(jp.getArgs()));
        System.out.println("切入点方法签名对象：" + jp.getSignature());
        System.out.println("切入点所在目标对象：" + jp.getTarget());
        System.out.println("代理对象本身：" + jp.getThis());
        System.out.println("-------------------------------");
        try {
            System.out.println("执行切入点方法");
            jp.proceed();
            System.out.println("-------------------------------");
            System.out.println("执行切入点方法并改变参数");
            jp.proceed(new Object[]{7});
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
