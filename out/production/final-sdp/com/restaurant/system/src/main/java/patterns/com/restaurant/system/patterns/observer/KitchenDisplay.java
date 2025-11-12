package com.restaurant.system.patterns.observer;

public class KitchenDisplay implements OrderObserver {
    @Override
    public void update(String message) {
        System.out.println("KITCHEN: " + message);
    }
}