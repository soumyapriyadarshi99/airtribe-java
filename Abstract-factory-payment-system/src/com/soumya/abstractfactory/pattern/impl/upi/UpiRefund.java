package com.soumya.abstractfactory.pattern.impl.upi;

import com.soumya.abstractfactory.pattern.model.Refund;

public class UpiRefund implements Refund {

    @Override
    public void refund(){
        System.out.println("Upi refund...");
    }
}
