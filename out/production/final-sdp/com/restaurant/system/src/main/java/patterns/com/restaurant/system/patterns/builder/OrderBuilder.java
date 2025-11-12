package com.restaurant.system.patterns.builder;

import com.restaurant.system.model.*;
import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {
    private String orderId;
    private String customerName;
    private final List<MenuItem> items = new ArrayList<>();

    public OrderBuilder orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public OrderBuilder customer(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public OrderBuilder addItem(MenuItem item) {
        this.items.add(item);
        return this;
    }

    public Order build() {
        if (orderId == null || customerName == null || items.isEmpty()) {
            throw new IllegalStateException("Order must have ID, customer, and at least one item.");
        }
        return new Order(orderId, customerName, items);
    }
}