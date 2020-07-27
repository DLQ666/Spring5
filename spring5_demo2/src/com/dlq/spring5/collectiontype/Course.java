package com.dlq.spring5.collectiontype;

/**
 *@program: Spring5
 *@description: 课程类
 *@author: Hasee
 *@create: 2020-07-26 12:51
 */
public class Course {

    private String cname;//课程名称

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
