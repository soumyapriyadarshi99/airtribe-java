package com.soumya.observerpattern.strategy;

public class SMS implements NotificationStrategy{

    @Override
    public void send(String userName, String stockName, double price){
        System.out.println("SMS sent to "+userName+" for "+stockName+" with price: "+ price);
    }
}
