package com.example.xmlconfig.inheritancedi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        Order order = context.getBean("order", Order.class);
        order.placeOrder();
    }
}
