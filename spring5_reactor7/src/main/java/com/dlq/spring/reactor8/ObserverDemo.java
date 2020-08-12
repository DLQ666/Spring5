package com.dlq.spring.reactor8;

import java.util.Observable;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-08-12 15:43
 */
public class ObserverDemo extends Observable {

    public static void main(String[] args) {
        ObserverDemo observer = new ObserverDemo();
        //添加观察者
        observer.addObserver((o,arg)->{
            System.out.println("发生了变化");
        });
        observer.addObserver((o,arg)->{
            System.out.println("收到被观察者通知，准备改变");
        });
        observer.setChanged();  //数据变化
        observer.notifyObservers(); //通知
    }
}
