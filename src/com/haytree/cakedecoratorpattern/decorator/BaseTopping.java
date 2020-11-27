package com.haytree.cakedecoratorpattern.decorator;

import com.haytree.cakedecoratorpattern.Cake;

/**
 * This is the base decorator class.
 * All decorators must extend this class.
 */
public abstract class BaseTopping extends Cake {
    // A reference to the wrapped object. This can be the
    // concrete component or a decorator which already wraps
    // a concrete component.
    private Cake cake;

    // This is used by the decorators to set their reference
    // object which it is wrapping. The object is passed into the
    // decorator by the constructor.
    public void setCake(Cake cake) {
        this.cake = cake;
    }

    public Cake getCake() {
        return cake;
    }

    public abstract String getDescription();
}
