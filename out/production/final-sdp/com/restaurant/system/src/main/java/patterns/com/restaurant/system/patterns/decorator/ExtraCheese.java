package com.restaurant.system.patterns.decorator;

import com.restaurant.system.model.MenuItem;

public class ExtraCheese extends MenuItemDecorator {
    public ExtraCheese(MenuItem item) {
        super(item, "Extra Cheese", 1.50);
    }
}