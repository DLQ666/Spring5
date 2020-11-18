package com.dlq.example;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-11-18 13:26
 */
public class ClientCode {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.setB(b);
        b.setA(a);
    }
}
