package com.dlq.example;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-11-18 13:25
 */
public class A {
    private B b;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public A() {
        System.out.println("---A created success");
    }
}
