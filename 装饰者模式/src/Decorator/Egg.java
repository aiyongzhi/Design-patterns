package Decorator;

import Component.FastFood;

public class Egg extends Garnish{
    public Egg(FastFood fastFood) {
        super(fastFood, 1.5,"鸡蛋");
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
