package com.restaurant.system.patterns.facade;

import com.restaurant.system.model.Order;
import com.restaurant.system.patterns.strategy.PaymentStrategy;

public class RestaurantFacade {
    public void processOrder(Order order, PaymentStrategy payment) {
        System.out.println("FACADE: Processing Order ...");
        System.out.println(order);
        payment.pay(order.getTotal());
        System.out.println("Order sent to kitchen.\n");
    }
}