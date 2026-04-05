package com.soumya.abstractfactory.pattern.factory;

import com.soumya.abstractfactory.pattern.impl.upi.UpiPayment;
import com.soumya.abstractfactory.pattern.impl.upi.UpiRefund;
import com.soumya.abstractfactory.pattern.impl.upi.UpiValidate;
import com.soumya.abstractfactory.pattern.model.Payment;
import com.soumya.abstractfactory.pattern.model.Refund;
import com.soumya.abstractfactory.pattern.model.Validate;

public class UpiFactory implements PaymentFactory {

    @Override
    public Payment createPayment(){
        return new UpiPayment();
    };

    @Override
    public Refund createRefund(){
        return new UpiRefund();
    };

    @Override
    public Validate createValidate(){
        return new UpiValidate();
    };

}
