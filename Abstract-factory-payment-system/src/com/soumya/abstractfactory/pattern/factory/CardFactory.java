package com.soumya.abstractfactory.pattern.factory;

import com.soumya.abstractfactory.pattern.impl.card.CardPayment;
import com.soumya.abstractfactory.pattern.impl.card.CardRefund;
import com.soumya.abstractfactory.pattern.impl.card.CardValidate;
import com.soumya.abstractfactory.pattern.model.Payment;
import com.soumya.abstractfactory.pattern.model.Refund;
import com.soumya.abstractfactory.pattern.model.Validate;

public class CardFactory implements PaymentFactory{

    @Override
    public Payment createPayment(){
        return new CardPayment();
    }

    @Override
    public Refund createRefund(){
        return new CardRefund();
    }

    @Override
    public Validate createValidate(){
        return new CardValidate();
    }

}
