package com.soumya.observerpattern.subject;

import com.soumya.observerpattern.observer.Observer;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
