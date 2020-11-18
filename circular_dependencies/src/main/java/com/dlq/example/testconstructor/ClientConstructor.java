package com.dlq.example.testconstructor;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-11-18 12:01
 *
 * 通过构造器的方式注入依赖，构造器的方式注入依赖的bean，下面两个bean循环依赖
 *
 * 测试后发现，构造器循环依赖是无法解决的
 */
public class ClientConstructor {
    public static void main(String[] args) {
//        new ServiceA(new ServiceB(new ServiceA(new ServiceB()))); .....
    }
}



