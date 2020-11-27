package com.haytree.cakedecoratorpattern.component;

import com.haytree.cakedecoratorpattern.Cake;

public class FruitCake extends Cake {
    public FruitCake() {
        setDescription("Type: Fruit Cake\nToppings: ");
    }

    @Override
    public double cost() {
        return 6.20;
    }
}
