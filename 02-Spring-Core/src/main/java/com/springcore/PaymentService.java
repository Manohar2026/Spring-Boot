package com.springcore;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public PaymentService() {
        System.out.println("payment");
    }

    public void pay() {
        System.out.println("Payment successfull");
    }
}
