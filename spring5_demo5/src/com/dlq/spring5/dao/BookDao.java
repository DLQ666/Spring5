package com.dlq.spring5.dao;

import com.dlq.spring5.entity.Book;

import java.util.List;

/**
 *@description:
 *@author: Hasee
 *@create: 2020-07-27 19:10
 */
public interface BookDao {
    //添加的方法
    void add(Book book);

    //修改
    void updateBook(Book book);

    //删除
    void delete(String id);

    //查询表记录数
    int selectCount();

    //查询返回对象
    Book findBookInfo(String id);

    //查询返回集合
    List<Book> findAllBook();

    //批量添加
    void batchAddBook(List<Object[]> batchArgs);

    //批量修改
    void batchUpdateBook(List<Object[]> batchArgs);

    //批量删除
    void batchDeleteBook(List<Object[]> batchArgs);
}
