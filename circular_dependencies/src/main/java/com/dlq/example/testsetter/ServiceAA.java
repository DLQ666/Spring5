package com.dlq.example.testsetter;

import org.springframework.stereotype.Component;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-11-18 12:01
 */
@Component
public class ServiceAA {

    private ServiceBB serviceBB;

    public void setServiceBB(ServiceBB serviceBB) {
        this.serviceBB = serviceBB;
        System.out.println("AA--里面设置了--BB");
    }
}
