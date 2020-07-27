package com.dlq.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-07-27 12:03
 */
@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao{

    @Override
    public void add() {
        System.out.println("dao add......");
    }
}
