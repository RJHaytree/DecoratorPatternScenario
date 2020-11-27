package com.haytree.cakedecoratorpattern.decorator;

import com.haytree.cakedecoratorpattern.Cake;

public class IcingSugar extends BaseTopping {
    public IcingSugar(Cake cake) {
        setCake(cake);
    }

    @Override
    public double cost() {
        return getCake().cost() + 0.29;
    }

    @Override
    public String getDescription() {
        return getCake().getDescription() + "\n - Icing Sugar";
    }
}
