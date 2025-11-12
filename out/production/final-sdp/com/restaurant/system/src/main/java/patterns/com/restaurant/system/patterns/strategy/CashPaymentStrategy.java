package com.restaurant.system.patterns.strategy;

public class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + String.format("%.2f", amount) + " in CASH.");
    }
}