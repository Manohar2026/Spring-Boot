package com.example.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

//        This line is used to up our IoC container
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


        OrderService orderService = context.getBean("orderService", OrderService.class);
        orderService.print();

        PaymentService paymentService = context.getBean(PaymentService.class);
        System.out.println(paymentService.getNames());
    }
}