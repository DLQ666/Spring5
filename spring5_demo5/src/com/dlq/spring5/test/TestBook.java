package com.dlq.spring5.test;

import com.dlq.spring5.entity.Book;
import com.dlq.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-07-27 19:36
 */
public class TestBook {

    @Test
    public void testJdbcTemplateAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        //添加
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("java");
//        book.setUstatus("a");
//        bookService.addBook(book);

        //修改
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("javaupupupu");
//        book.setUstatus("adldldlldldldlqqqqqq");
//        bookService.updateBook(book);

        //删除
//        bookService.delBook("1");

        //查询返回某个值
//        int count = bookService.findCount();
//        System.out.println(count);

        //查询返回对象
//        Book book = bookService.findOne("1");
//        System.out.println(book);

        //查询返回集合
//        List<Book> all = bookService.findAll();
//        System.out.println(all);

        //批量添加
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"3","c++","b"};
//        Object[] o2 = {"4","python","c"};
//        Object[] o3 = {"5","redis","d"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        //调用批量添加
//        bookService.batchAdd(batchArgs);

        //批量修改
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"c++C++","b1","3"};
//        Object[] o2 = {"python+++++","c1","4"};
//        Object[] o3 = {"redis++++","d1","5"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        //调用方法实现批量修改
//        bookService.batchUpdate(batchArgs);

        //批量删除
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3"};
        Object[] o2 = {"4"};
        Object[] o3 = {"5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        //调用方法实现批量删除
        bookService.batchDelete(batchArgs);
    }

}
