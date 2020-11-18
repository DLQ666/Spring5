package com.dlq.example.testconstructor;

import org.springframework.stereotype.Component;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-11-18 12:01
 */
@Component
public class ServiceA {

    private ServiceB serviceB;

    public ServiceA(ServiceB serviceB) {
        this.serviceB = serviceB;
    }
}
