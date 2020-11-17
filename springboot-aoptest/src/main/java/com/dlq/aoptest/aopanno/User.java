package com.dlq.aoptest.aopanno;

import org.springframework.stereotype.Component;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-11-17 16:14
 */
@Component
public class User {

    public void add(){
//        int i = 10/0;
        System.out.println("目标方法-----add........");
    }
}
