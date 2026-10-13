package com.xmlconfig.inheritancedi;

public class UpiPayment implements Payment {

    public UpiPayment() {
        System.out.println("UPI Constructor");
    }
    @Override
    public void pay() {
        System.out.println("UPI payment");
    }
}
