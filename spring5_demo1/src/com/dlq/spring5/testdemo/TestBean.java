package com.dlq.spring5.testdemo;

import com.dlq.spring5.Book;
import com.dlq.spring5.Orders;
import com.dlq.spring5.User;
import com.dlq.spring5.bean.Emp;
import com.dlq.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *@program: spring5_demo1
 *@description:
 *@author: Hasee
 *@create: 2020-07-25 19:40
 */
public class TestBean {

    //外部bean注入测试
    @Test
    public void testBean1(){
        //1、加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        //2、获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }

    //注入内部bean和级联赋值
    @Test
    public void testBean2(){
        //1、加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        //2、获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);

        emp.add();
    }

    //级联赋值--->外部bean注入
    @Test
    public void testBean3(){
        //1、加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        //2、获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);

        emp.add();
    }

}
