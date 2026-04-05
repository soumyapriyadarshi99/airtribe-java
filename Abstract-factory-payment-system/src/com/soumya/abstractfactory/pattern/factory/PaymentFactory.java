package com.soumya.abstractfactory.pattern.factory;

import com.soumya.abstractfactory.pattern.model.Payment;
import com.soumya.abstractfactory.pattern.model.Refund;
import com.soumya.abstractfactory.pattern.model.Validate;

public interface PaymentFactory {
    Payment createPayment();
    Refund createRefund();
    Validate createValidate();
}
