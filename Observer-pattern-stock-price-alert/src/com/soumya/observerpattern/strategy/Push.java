package com.soumya.observerpattern.strategy;

public class Push implements NotificationStrategy {

    @Override
    public void send(String userName, String stockName, double price){
        System.out.println("Push notification sent to "+userName+" for "+stockName+" with price: "+ price);
    }
}
