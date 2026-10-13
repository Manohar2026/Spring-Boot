package com.example.xmlconfig;

import org.springframework.core.annotation.Order;

public class OrderService {

    private PaymentService paymentService;

    public OrderService() {

    }

//    public OrderService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    void print() {
        paymentService.pay();
        System.out.println("Order Placed");
    }
}
