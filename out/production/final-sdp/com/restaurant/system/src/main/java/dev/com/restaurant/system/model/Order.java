package com.restaurant.system.model;

import com.restaurant.system.patterns.observer.OrderSubject;
import java.util.ArrayList;
import java.util.List;

public class Order extends OrderSubject {
    private final String orderId;
    private final String customerName;
    private final List<MenuItem> items;
    private final double total;

    public Order(String orderId, String customerName, List<MenuItem> items) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = new ArrayList<>(items);
        this.total = items.stream().mapToDouble(MenuItem::getPrice).sum();
        notifyObservers("Order placed: " + this);
    }

    public String getOrderId() { return orderId; }
    public String getCustomerName() { return customerName; }
    public List<MenuItem> getItems() { return items; }
    public double getTotal() { return total; }

    @Override
    public String toString() {
        return "Order#" + orderId + " | " + customerName + " → " + items.size() + " items ($" + String.format("%.2f", total) + ")";
    }
}