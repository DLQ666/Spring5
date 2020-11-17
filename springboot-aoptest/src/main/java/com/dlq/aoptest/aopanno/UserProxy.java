package com.dlq.aoptest.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-11-17 16:14
 */
@Component
@Aspect //生成代理对象
public class UserProxy {

    //前置通知
    //@Before注解表示作为前置通知
    @Before(value = "execution(* com.dlq.aoptest.aopanno.User.add(..))")
    public void before() {
        System.out.println("//前置通知--@Before.......");
    }

    //最终通知
    @After(value = "execution(* com.dlq.aoptest.aopanno.User.add(..))")
    public void after() {
        System.out.println("//最终通知--@After........");
    }

    //后置通知（返回通知）
    @AfterReturning(value = "execution(* com.dlq.aoptest.aopanno.User.add(..))")
    public void afterReturning() {
        System.out.println("//后置通知（返回通知）-- @AfterReturning........");
    }

    //异常通知
    @AfterThrowing(value = "execution(* com.dlq.aoptest.aopanno.User.add(..))")
    public void afterThrowing() {
        System.out.println("//异常通知-- @AfterThrowing........");
    }

    //环绕通知
    @Around(value = "execution(* com.dlq.aoptest.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("@Around//环绕通知--环绕之前........");

        //被增强方法执行
        proceedingJoinPoint.proceed();

        System.out.println("@Around//环绕通知--环绕之后........");
    }
}
