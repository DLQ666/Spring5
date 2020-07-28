package com.dlq.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *@program: Spring5
 *@description: dao接口实现类
 *@author: Hasee
 *@create: 2020-07-28 13:13
 */
@Repository
public class UserDaoImpl implements UserDao{

    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //lucy转账100给mary
    //少钱
    @Override
    public void reduceMoney() {
        String sql = "UPDATE t_account SET money = money -? WHERE username =?";
        jdbcTemplate.update(sql,100,"lucy");
    }

    //多钱
    @Override
    public void addMoney() {
        String sql = "UPDATE t_account SET money = money +? WHERE username =?";
        jdbcTemplate.update(sql,100,"mary");
    }

}
