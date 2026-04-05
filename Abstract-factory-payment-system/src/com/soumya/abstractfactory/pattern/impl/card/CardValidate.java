package com.soumya.abstractfactory.pattern.impl.card;

import com.soumya.abstractfactory.pattern.model.Validate;

public class CardValidate implements Validate {

    @Override
    public void validate(){
        System.out.println("Card validate...");
    }

}
