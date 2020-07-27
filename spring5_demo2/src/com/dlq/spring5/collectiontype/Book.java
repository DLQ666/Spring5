package com.dlq.spring5.collectiontype;

import org.junit.Test;

import java.util.List;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-07-26 12:57
 */
public class Book {

    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test(){
        System.out.println(list);
    }
}
