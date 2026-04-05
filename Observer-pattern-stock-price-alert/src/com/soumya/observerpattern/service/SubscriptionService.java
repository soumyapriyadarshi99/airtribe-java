package com.soumya.observerpattern.service;

import com.soumya.observerpattern.model.User;
import com.soumya.observerpattern.subject.Stock;

public class SubscriptionService {
    public void subscribe(User user, Stock stock){
        stock.addObserver(user);
    };
    public void unsubscribe(User user, Stock stock){
        stock.removeObserver(user);
    };
}
