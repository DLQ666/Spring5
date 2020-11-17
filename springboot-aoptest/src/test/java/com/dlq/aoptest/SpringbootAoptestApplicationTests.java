package com.dlq.aoptest;

import com.dlq.aoptest.aopanno.User;
import com.dlq.aoptest.aopanno.UserProxy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class SpringbootAoptestApplicationTests {

    @Autowired
    private User user;

    @Test
    void contextLoads() {
    }

    @Test
    public void testAopAnno(){
        user.add();
    }

}
