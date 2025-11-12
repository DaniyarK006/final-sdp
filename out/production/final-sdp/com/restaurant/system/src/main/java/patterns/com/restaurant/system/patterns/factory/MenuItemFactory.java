package com.restaurant.system.patterns.factory;

import com.restaurant.system.model.MenuItem;
import com.restaurant.system.model.Pasta;
import com.restaurant.system.model.Pizza;

public class MenuItemFactory {
    public static MenuItem createPizza() {
        return new Pizza();
    }

    public static MenuItem createPasta() {
        return new Pasta();
    }
}