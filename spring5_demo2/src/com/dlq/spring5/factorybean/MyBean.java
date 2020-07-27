package com.dlq.spring5.factorybean;

import com.dlq.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-07-26 13:12
 */
public class MyBean implements FactoryBean<Course> {

    //定义返回的bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("asd");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
