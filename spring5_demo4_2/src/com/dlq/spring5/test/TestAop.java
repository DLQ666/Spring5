package com.dlq.spring5.test;

import com.dlq.spring5.aopanno.User;
import com.dlq.spring5.config.ConfigAop;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-11-17 17:41
 */
public class TestAop {

    @Test
    public void testAopAnno(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAop.class);
        User user = context.getBean("user", User.class);
        user.add();
    }

}
