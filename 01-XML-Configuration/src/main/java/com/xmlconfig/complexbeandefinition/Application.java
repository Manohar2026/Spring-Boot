package com.xmlconfig.complexbeandefinition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        Student student = context.getBean("student", Student.class);
        student.print();
    }
}
