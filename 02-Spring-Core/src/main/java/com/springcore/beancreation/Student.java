package com.springcore.beancreation;

import org.springframework.stereotype.Component;

@Component
public class Student {

    public Student() {
        System.out.println("Student class constructor called");
    }
}
