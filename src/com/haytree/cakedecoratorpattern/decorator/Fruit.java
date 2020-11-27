package com.haytree.cakedecoratorpattern.decorator;

import com.haytree.cakedecoratorpattern.Cake;

public class Fruit extends BaseTopping {
    public Fruit(Cake cake) {
        setCake(cake);
    }

    @Override
    public double cost() {
        return getCake().cost() + 0.89;
    }

    @Override
    public String getDescription() {
        return getCake().getDescription() + "\n - Fruit";
    }
}
