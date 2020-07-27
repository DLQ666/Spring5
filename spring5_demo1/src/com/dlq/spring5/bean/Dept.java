package com.dlq.spring5.bean;

/**
 *@program: spring5_demo1
 *@description: 部门类
 *@author: Hasee
 *@create: 2020-07-26 11:19
 */
public class Dept {

    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
