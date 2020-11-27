package com.haytree.cakedecoratorpattern;

import com.haytree.cakedecoratorpattern.component.ChocolateCake;
import com.haytree.cakedecoratorpattern.component.SpongeCake;
import com.haytree.cakedecoratorpattern.decorator.FondantIcing;
import com.haytree.cakedecoratorpattern.decorator.Fruit;
import com.haytree.cakedecoratorpattern.decorator.IcingSugar;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Cake> cakes;

    public static void main(String[] args) {
        cakes = new ArrayList<>();

        // Instantiate a concrete component
        Cake choc = new ChocolateCake();
        // Instantiate a concrete decorator
        FondantIcing chocIcing = new FondantIcing(choc);
        // Add to list with type 'Cake', since all objects involved in the
        // task extend the 'Cake' class.
        cakes.add(chocIcing);

        // Instantiate a concrete component
        Cake sponge = new SpongeCake();
        // Instantiate concrete decorators, wrapping the concrete component
        // in within these decorators.
        Fruit spongeFruit = new Fruit(sponge);
        IcingSugar sugarFruitSponge = new IcingSugar(spongeFruit);
        // Once again, the cake can be added to the list due to all objects
        // derive from the 'Cake' class.
        cakes.add(sugarFruitSponge);

        for (Cake c : cakes) {
            System.out.println("-----------------------------------------");
            System.out.println(c.getDescription());
        }
    }
}
