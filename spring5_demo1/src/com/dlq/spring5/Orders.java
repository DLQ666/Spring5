package com.dlq.spring5;

/**
 *@program: spring5_demo1
 *@description: 订单类
 *@author: Hasee
 *@create: 2020-07-25 20:45
 *
 * 使用有参构造注入
 */
public class Orders {

    //属性
    private String oname;
    private String address;

    //有参数构造
    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void ordersTest(){
        System.out.println(oname+ "::"+address);
    }
}
