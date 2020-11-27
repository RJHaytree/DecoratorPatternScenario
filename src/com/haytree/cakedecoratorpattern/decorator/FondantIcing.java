package com.haytree.cakedecoratorpattern.decorator;

import com.haytree.cakedecoratorpattern.Cake;

/**
 * This is a concrete decorator, identifiable by the class
 * extending the base decorator. {@link BaseTopping}
 */
public class FondantIcing extends BaseTopping {
    // The constructor is used to pass in the object being
    // wrapped.
    public FondantIcing(Cake cake) {
        // Allocate the object being wrapped in the super class.
        setCake(cake);
    }

    /**
     * This methods override existing methods inherited by the component and
     * base decorator. This details the decorator providing their own
     * functionality to a method.
     * @return
     */
    @Override
    public double cost() {
        return getCake().cost() + 0.59;
    }

    @Override
    public String getDescription() {
        return getCake().getDescription() + "\n - Fondant Icing";
    }
}
