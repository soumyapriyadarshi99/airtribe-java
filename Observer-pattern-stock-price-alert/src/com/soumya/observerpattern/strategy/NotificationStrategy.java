package com.soumya.observerpattern.strategy;

public interface NotificationStrategy {
    void send(String userName, String stockName, double price);
}
