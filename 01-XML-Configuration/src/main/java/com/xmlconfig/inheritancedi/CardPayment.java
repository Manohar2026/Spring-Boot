package com.xmlconfig.inheritancedi;

public class CardPayment implements Payment {

    public CardPayment() {
        System.out.println("Card Constructor");
    }

    @Override
    public void pay() {
        System.out.println("Card Payment");
    }
}
