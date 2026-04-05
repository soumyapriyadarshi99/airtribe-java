package com.soumya.observerpattern.strategy;

public class Email implements NotificationStrategy{

    @Override
    public void send(String userName, String stockName, double price){
        System.out.println("Email sent to "+userName+" for "+stockName+" with price: "+ price);
    }
}
