package com.example.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfig {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        OrderService orderService = context.getBean(OrderService.class);
        orderService.print();
    }
}