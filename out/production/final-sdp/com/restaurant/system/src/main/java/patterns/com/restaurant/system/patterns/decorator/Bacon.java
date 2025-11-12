package com.restaurant.system.patterns.decorator;

import com.restaurant.system.model.MenuItem;

public class Bacon extends MenuItemDecorator {
    public Bacon(MenuItem item) {
        super(item, "Crispy Bacon", 2.00);
    }
}