package com.xmlconfig.dependencyinjection;

public class OrderService {

    private PaymentService paymentService;

//    CONSTRUCTOR INJECTION
//    public OrderService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

//    SETTER INJECTION
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.pay();
        System.out.println("Order Placed");
    }
}
