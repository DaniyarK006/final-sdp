package com.restaurant.system.patterns.decorator;

import com.restaurant.system.model.MenuItem;

public abstract class MenuItemDecorator extends MenuItem {
    protected MenuItem wrapped;

    public MenuItemDecorator(MenuItem wrapped, String name, double price) {
        super(name + " + " + wrapped.getName(), price + wrapped.getPrice());
        this.wrapped = wrapped;
    }
}