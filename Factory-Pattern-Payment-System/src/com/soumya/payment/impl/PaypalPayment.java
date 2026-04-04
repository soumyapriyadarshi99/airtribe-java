package com.soumya.payment.impl;

import com.soumya.payment.model.Payment;

public class PaypalPayment implements Payment {

    @Override
    public void pay(double value){
        System.out.println(value + " paid through Paypal...");
    }

    @Override
    public void validate(){
        System.out.println("Paypal payment validated...");
    }
}
