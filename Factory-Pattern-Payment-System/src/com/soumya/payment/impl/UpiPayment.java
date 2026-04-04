package com.soumya.payment.impl;

import com.soumya.payment.model.Payment;

public class UpiPayment implements Payment {

    @Override
    public void pay(double value){
        System.out.println(value + " Paid through UPI payment...");
    }

    @Override
    public void validate(){
        System.out.println("UPI payment validated...");
    }
}
