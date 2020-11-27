package com.haytree.cakedecoratorpattern.component;

import com.haytree.cakedecoratorpattern.Cake;

/**
 * This is a concrete component, shown by the class extending the component.
 */
public class ChocolateCake extends Cake {
    /**
     * The constructor sets the cake's description, where the description
     * variable is located in the Cake class.
     */
    public ChocolateCake() {
        setDescription("Type: Chocolate Cake\nToppings: ");
    }

    @Override
    public double cost() {
        return 5.19;
    }
}
