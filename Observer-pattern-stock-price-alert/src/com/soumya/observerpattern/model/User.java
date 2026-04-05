package com.soumya.observerpattern.model;

import com.soumya.observerpattern.observer.Observer;
import com.soumya.observerpattern.strategy.NotificationStrategy;

import java.util.ArrayList;
import java.util.List;

public class User implements Observer {
    private String name;
    private List<NotificationStrategy> strategies;

    public User(String name){
        this.name = name;
        this.strategies = new ArrayList<>();
    }

    public void addStrategy(NotificationStrategy stratgey){
        strategies.add(stratgey);
    }

    @Override
    public void update(String stockName, double price) {
        for (NotificationStrategy s : strategies) {
            s.send(name, stockName, 3500);
        }
    }




}
