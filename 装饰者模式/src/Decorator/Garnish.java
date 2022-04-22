package Decorator;

import Component.FastFood;

/*  抽象装饰者   */
public abstract class Garnish extends FastFood {
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood , double price, String desc) {
        super(price, desc);
        this.fastFood=fastFood;
    }

    @Override
    public abstract double cost();
}
