package com.haytree.cakedecoratorpattern.component;

import com.haytree.cakedecoratorpattern.Cake;

public class SpongeCake extends Cake {
    public SpongeCake() {
        setDescription("Type: Victoria Sponge\nToppings: ");
    }

    @Override
    public double cost() {
        return 4.80;
    }
}
