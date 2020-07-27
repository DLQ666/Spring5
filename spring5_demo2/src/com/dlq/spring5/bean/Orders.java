package com.dlq.spring5.bean;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-07-26 13:43
 */
public class Orders {

    private String oname;

    //无参构造
    public Orders() {
        System.out.println("第一步 执行无参数构造创建bean实例");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步 调用set方法设置属性值");
    }

    //创建执行的初始化的方法
    public void initMethod(){
        System.out.println("第三步 执行初始化的方法");
    }

    //创建执行的销毁的方法
    public void destroyMethod(){
        System.out.println("第五步 执行销毁的方法");
    }
}
