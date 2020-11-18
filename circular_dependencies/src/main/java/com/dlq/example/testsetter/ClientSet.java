package com.dlq.example.testsetter;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-11-18 13:18
 */
public class ClientSet {
    public static void main(String[] args) {

        //创建serviceA
        ServiceAA a = new ServiceAA();

        //创建serviceB
        ServiceBB b = new ServiceBB();

        //将serviceA注入到serviceB中
        b.setServiceAA(a);

        //将serviceB注入到serviceA中
        a.setServiceBB(b);

    }
}
