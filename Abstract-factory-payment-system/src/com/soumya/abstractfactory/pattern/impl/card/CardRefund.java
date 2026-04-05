package com.soumya.abstractfactory.pattern.impl.card;

import com.soumya.abstractfactory.pattern.model.Refund;

public class CardRefund implements Refund {

    @Override
    public void refund(){
        System.out.println("Card refund...");
    }
}
