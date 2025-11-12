package com.restaurant.system.model.main;

import com.restaurant.system.model.*;
import com.restaurant.system.patterns.builder.OrderBuilder;
import com.restaurant.system.patterns.decorator.*;
import com.restaurant.system.patterns.facade.RestaurantFacade;
import com.restaurant.system.patterns.factory.MenuItemFactory;
import com.restaurant.system.patterns.observer.KitchenDisplay;
import com.restaurant.system.patterns.strategy.CashPaymentStrategy;
public class Main {
    public static void main(String[] args) {
        System.out.println("=== RESTAURANT ORDERING SYSTEM - 6 DESIGN PATTERNS ===\n");

        RestaurantFacade facade = new RestaurantFacade();
        KitchenDisplay kitchen = new KitchenDisplay();

        // BUILD ORDER: Builder + Factory + Decorator
        Order order = new OrderBuilder()
                .orderId("ORD-001")
                .customer("Alice Bi-stone")
                .addItem(new ExtraCheese(MenuItemFactory.createPizza()))
                .addItem(new Bacon(new ExtraCheese(MenuItemFactory.createPasta())))
                .build();

            // ADD THIS LINE RIGHT AFTER .build()
            order.addObserver(kitchen);  // ← THIS MAKES OBSERVER WORK

        // STRATEGY + FACADE
        facade.processOrder(order, new CashPaymentStrategy());
    }
}