package com.soumya.abstractfactory.pattern;

import com.soumya.abstractfactory.pattern.factory.CardFactory;
import com.soumya.abstractfactory.pattern.factory.PaymentFactory;
import com.soumya.abstractfactory.pattern.factory.UpiFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------- Payment session started --------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the type of payment: ");
        PaymentTypes paymentType = PaymentTypes.valueOf(sc.next().trim().toUpperCase());

        PaymentFactory factory = switch (paymentType){
            case UPI -> new UpiFactory();
            case CARD -> new CardFactory();
            default -> throw new IllegalArgumentException("Please enter valid payment method");
        };

        factory.createPayment().pay();
        factory.createValidate().validate();
        factory.createRefund().refund();

        System.out.println("------------------ Payment session completed ------------------");

    }
}