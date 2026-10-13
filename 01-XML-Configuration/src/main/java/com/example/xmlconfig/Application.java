package com.example.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

//        This line is used to up our IoC container
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        We can get bean with our bean id, but since it returns Object type so we need to downcast it.
//        OrderService orderService = (OrderService) context.getBean("orderService");

//        We can also use reflection api (bean class) to get bean from our IoC container, but it fails if we have more than one objects of same type. This is the only line works if we don't have id in our bean definition.
//        OrderService orderService = context.getBean(OrderService.class);

//        To avoid confusion while managing multiple bean of same type, we can pass bean id and use reflection together, and it is the preferred option.
        OrderService orderService = context.getBean("orderService", OrderService.class);
        orderService.print();
    }
}