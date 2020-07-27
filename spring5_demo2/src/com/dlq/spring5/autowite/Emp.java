package com.dlq.spring5.autowite;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-07-26 14:28
 */
public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test(){
        System.out.println(dept);
    }
}
