package com.example.xmlconfig.inheritancedi;

public class Order {

    private Payment payment;

    public Order(Payment payment) {
        System.out.println("order Constructor");
        this.payment = payment;
    }

    public void placeOrder() {
        payment.pay();
        System.out.println("Order placed");
    }
}
