package com.soumya.abstractfactory.pattern.impl.card;

import com.soumya.abstractfactory.pattern.model.Payment;

public class CardPayment implements Payment {

    @Override
    public void pay(){
        System.out.println("Card payment...");
    }
}
