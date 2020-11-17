package com.dlq.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-07-27 16:22
 */
@Configuration
@ComponentScan(basePackages = {"com.dlq"})
@EnableAspectJAutoProxy(proxyTargetClass =true)
public class ConfigAop {
}
