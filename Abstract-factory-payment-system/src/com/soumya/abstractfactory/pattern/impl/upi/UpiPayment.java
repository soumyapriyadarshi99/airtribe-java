package com.soumya.abstractfactory.pattern.impl.upi;

import com.soumya.abstractfactory.pattern.model.Payment;

public class UpiPayment implements Payment {

    @Override
    public void pay(){
        System.out.println("UPI Payment...");
    }

}
