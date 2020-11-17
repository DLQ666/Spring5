package com.dlq.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *@program: Spring5
 *@description: 增强类
 *@author: Hasee
 *@create: 2020-07-27 15:23
 *
 * 增强类
 */
@Component
@Aspect //生成代理对象
public class UserProxy {

    //相同切入点抽取
    @Pointcut(value = "execution(* com.dlq.spring5.aopanno.User.add(..))")
    public void pointdemo(){
    }

    //前置通知
    //@Before注解表示作为前置通知
    @Before(value = "pointdemo()")
    public void before() {
        System.out.println("before.......");
    }

    //最终通知
    @After(value = "pointdemo()")
    public void after() {
        System.out.println("after........");
    }

    //后置通知（返回通知）
    @AfterReturning(value = "pointdemo()")
    public void afterReturning() {
        System.out.println("afterReturning........");
    }

    //异常通知
    @AfterThrowing(value = "pointdemo()")
    public void afterThrowing() {
        System.out.println("afterThrowing........");
    }

    //环绕通知
    @Around(value = "pointdemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前........");

        //被增强方法执行
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后........");
    }
}
