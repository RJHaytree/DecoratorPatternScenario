package com.haytree.cakedecoratorpattern;

/**
 * This is the component class. All objects involved in the
 * decorator pattern must extend this class.
 */
public abstract class Cake {
    private String description = "Unknown cake";

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
