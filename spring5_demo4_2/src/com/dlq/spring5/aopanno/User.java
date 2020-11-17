package com.dlq.spring5.aopanno;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *@program: Spring5
 *@description: 被增强类
 *@author: Hasee
 *@create: 2020-07-27 15:22
 *
 * 被增强类
 */
@Component
public class User {

    public void add(){
//        int i = 10/0;
        System.out.println("目标方法执行---add........");
    }
}
