package com.dlq.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *@program: Spring5
 *@description: 配置类
 *@author: Hasee
 *@create: 2020-07-27 12:36
 */
@Configuration  //作为配置类，替代xml配置文件
@ComponentScan(basePackages = {"com.dlq"})
public class SpringConfig {
}
