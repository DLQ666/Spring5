package com.dlq.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-07-27 16:14
 */
@Component
@Aspect
@Order(1)
public class PersonProxy {

    //前置通知
    //@Before注解表示作为前置通知
    @Before(value = "execution(* com.dlq.spring5.aopanno.User.add(..))")
    public void before() {
        System.out.println("Person  before.......");
    }
}
