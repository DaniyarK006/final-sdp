package com.restaurant.system.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class OrderSubject {
    private final List<OrderObserver> observers = new ArrayList<>();

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    protected void notifyObservers(String message) {
        observers.forEach(obs -> obs.update(message));
    }
}