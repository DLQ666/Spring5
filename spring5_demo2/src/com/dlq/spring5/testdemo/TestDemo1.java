package com.dlq.spring5.testdemo;

import com.dlq.spring5.autowite.Emp;
import com.dlq.spring5.bean.Orders;
import com.dlq.spring5.collectiontype.Book;
import com.dlq.spring5.collectiontype.Course;
import com.dlq.spring5.collectiontype.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-07-26 12:42
 */
public class TestDemo1 {

    //数组类型属性、list集合类型属性、map集合类型属性、set集合类型属性注入测试
    @Test
    public void testCollection1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }
    //抽取公共list注入bean测试
    @Test
    public void testCollection2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
//        Book book = context.getBean("book", Book.class);
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
//        book.test();
        System.out.println(book1);
        System.out.println(book2);
    }
    //工厂Bean注入测试
    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }

    //演示Bean的生命周期
    @Test
    public void testBean3(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders",Orders.class);
        System.out.println("第四步 获取创建bean实例的对象");
        System.out.println(orders);

        //手动让bean实例销毁
//        ((ClassPathXmlApplicationContext)context).close();
        context.close();
    }

    //手动装配---也是原始方式加注入外部bean------然后改成自动装配
    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
