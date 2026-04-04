package com.soumya.payment;

import com.soumya.payment.factory.PaymentFactory;
import com.soumya.payment.types.PaymentType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------Payment started------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter payment type: ");
        PaymentType paymentType = PaymentType.valueOf(sc.next().trim().toUpperCase());

        PaymentFactory.getPayment(paymentType).pay(5000);
        PaymentFactory.getPayment(paymentType).validate();

    }
}