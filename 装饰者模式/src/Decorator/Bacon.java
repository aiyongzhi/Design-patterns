package Decorator;

import Component.FastFood;

public class Bacon extends Garnish{
    public Bacon(FastFood fastFood) {
        super(fastFood, 2,"培根");
    }
    @Override
    public double cost() {
        return this.getPrice()+getFastFood().cost();
    }

    @Override
    public String getDesc() {
        StringBuilder sb=new StringBuilder();
        sb.append(getFastFood().getDesc());
        sb.append("+");
        sb.append(super.getDesc());
        return sb.toString();
    }
}
