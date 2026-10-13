package com.example.xmlconfig;

public class PaymentService {

    private String name;
    private String greet;

    public PaymentService(String name, String greet) {
        this.name = name;
        this.greet = greet;
    }

    void pay() {
        System.out.println("Payment Successfull");
    }
}
