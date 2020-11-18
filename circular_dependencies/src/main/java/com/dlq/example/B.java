package com.dlq.example;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-11-18 13:25
 */
public class B {
    private A a;

    public A getA(){
        return a;
    }

    public void setA(A a){
        this.a = a;
    }

    public B(){
        System.out.println("---B created success");
    }
}
