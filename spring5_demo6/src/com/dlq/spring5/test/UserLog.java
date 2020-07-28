package com.dlq.spring5.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-07-28 16:05
 */
public class UserLog {

    private static final Logger log = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        log.info("hello log4j2");
        log.warn("hello log4j2");
    }
}
