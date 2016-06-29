package com.springweb.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springweb.service.FooService;

public class TestFooService {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:application-context.xml");
        
        FooService fooService = (FooService) ctx.getBean("fooService");
        
        System.out.println(fooService.getFooById(1));
    }
}
