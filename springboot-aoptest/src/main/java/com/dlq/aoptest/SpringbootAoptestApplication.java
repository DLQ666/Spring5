package com.dlq.aoptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan("com.dlq.aoptest.aopanno")
@SpringBootApplication
public class SpringbootAoptestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAoptestApplication.class, args);
    }

}
