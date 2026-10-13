package com.example.xmlconfig.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        OrderService orderService = context.getBean("orderService", OrderService.class);
        orderService.placeOrder();

    }
}
