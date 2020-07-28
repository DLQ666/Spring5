package com.dlq.spring5.test;

import com.dlq.spring5.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-07-28 17:10
 */
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:bean1.xml")

@SpringJUnitConfig(locations = "classpath:bean1.xml")
public class JTest5 {

    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.accountMoney();
    }
}
