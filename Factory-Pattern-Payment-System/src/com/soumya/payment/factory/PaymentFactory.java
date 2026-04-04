package com.soumya.payment.factory;

import com.soumya.payment.impl.CreditCardPayment;
import com.soumya.payment.impl.PaypalPayment;
import com.soumya.payment.impl.UpiPayment;
import com.soumya.payment.model.Payment;
import com.soumya.payment.types.PaymentType;

public class PaymentFactory {
    public static Payment getPayment(PaymentType paymentType){

        if(paymentType == null){
            throw new IllegalArgumentException("Payment type can not be null !!!");
        }

        return switch(paymentType){
            case UPI ->  new UpiPayment();
            case CREDIT_CARD -> new CreditCardPayment();
            case PAYPAL -> new PaypalPayment();
            default -> throw new IllegalArgumentException("Not a valid payment method !!!");
        };

    }
}
