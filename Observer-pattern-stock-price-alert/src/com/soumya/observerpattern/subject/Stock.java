package com.soumya.observerpattern.subject;

import com.soumya.observerpattern.observer.Observer;

import java.util.HashSet;
import java.util.Set;


public class Stock implements Subject{
    private String name;
    private double price;
    private Set<Observer> observers = new HashSet<>();

    public Stock(String name){
        this.name = name;
    }

    @Override
    public void addObserver(Observer observer){
        observers.add(observer);
    };

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    };

    @Override
    public void notifyObserver(){
        for (Observer o : observers){
            o.update(name, price);
        }
    };

    public void setPrice(double price){
        this.price = price;
        notifyObserver();
    }

    public String getName(){
        return name;
    }
}
