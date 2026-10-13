package com.example.xmlconfig;

import java.util.List;

public class PaymentService {

    private String name;
    private String greet;
    private List<String> names;

    public PaymentService(String name, String greet, List<String> names) {
        this.name = name;
        this.greet = greet;
        this.names = names;
    }

    public List<String> getNames() {
        return names;
    }

    void pay() {
        System.out.println("Payment Successfull");
    }
}
