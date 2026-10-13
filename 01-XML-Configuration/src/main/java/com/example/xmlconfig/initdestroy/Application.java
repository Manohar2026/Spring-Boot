package com.example.xmlconfig.initdestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");

        UserService userService = context.getBean("userService", UserService.class);
        userService.print();
        context.close();
    }
}
