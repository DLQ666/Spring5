package com.dlq.spring5.test;

import com.dlq.spring5.aopanno.User;
import com.dlq.spring5.aopxml.Book;
import com.dlq.spring5.config.ConfigAop;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *@program: Spring5
 *@description: 测试类
 *@author: Hasee
 *@create: 2020-07-27 15:39
 */
public class TestAop {

    @Test
    public void testAopAnno(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAop.class);
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testAopXml(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }

}
