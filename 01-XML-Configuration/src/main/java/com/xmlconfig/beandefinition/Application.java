package com.xmlconfig.beandefinition;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

//        This line is used to up our IoC container
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

//        We can get bean with our bean id, but since it returns Object type, so we need to downcast it.
//        FirstBeanCreation creation = (FirstBeanCreation) context.getBean("firstBeanCreation");

//        We can also use reflection api (bean class) to get bean from our IoC container, but it fails if we have more than one objects of same type. This is the only line works if we don't have id in our bean definition.
//        FirstBeanCreation creation = context.getBean(FirstBeanCreation.class);

//        To avoid confusion while managing multiple bean of same type, we can pass bean id and use reflection together, and it is the preferred option.
        FirstBeanCreation creation = context.getBean("firstBeanCreation", FirstBeanCreation.class);

        creation.placeOrder();

    }
}