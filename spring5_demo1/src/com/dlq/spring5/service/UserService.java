package com.dlq.spring5.service;

import com.dlq.spring5.dao.UserDao;
import com.dlq.spring5.dao.UserDaoImpl;

/**
 *@program: spring5_demo1
 *@description:
 *@author: Hasee
 *@create: 2020-07-25 21:49
 */
public class UserService {

    //创建UserDao类型属性，生成set方法 --->springXML方式
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add............");
        userDao.update();

        //创建UserDao对象 ---->原始方式创建
//        UserDao userDao = new UserDaoImpl();
//        userDao.update();

    }


}
