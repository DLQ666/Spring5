package com.dlq.spring5.test;

import com.dlq.spring5.config.TxConfig;
import com.dlq.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.lang.Nullable;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-07-27 19:36
 */
public class TestAccount {

    @Nullable
    private String bookName;

    @Test
    public void testAccountMoney(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void testAccountMoney1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void testAccountMoney2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    //函数式风格创建对象，交给spring进行管理
    @Test
    public void testGenericApplicationContext() {
        //1、创建GenericApplicationContext
        GenericApplicationContext context = new GenericApplicationContext();
        //2、调用context的方法对象注册
        context.refresh();
//        context.registerBean(User.class, () -> new User());  //第一种写法
        context.registerBean("user1",User.class, () -> new User()); //第二种写法 指定名字
        //3、获取在spring注册的对象
//        User user = (User) context.getBean("com.dlq.spring5.test.User");  //第一种写法
        User user = (User) context.getBean("user1"); //第二种写法 指定名字
        System.out.println(user);
    }
}
