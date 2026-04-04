package com.soumya.payment.impl;

import com.soumya.payment.model.Payment;

public class CreditCardPayment implements Payment {

    @Override
    public void pay(double value){
        System.out.println(value + " paid through credit card payment...");
    }

    @Override
    public void validate(){
        System.out.println("Credit card payment validated...");
    }
}
