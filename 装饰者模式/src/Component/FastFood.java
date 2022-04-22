package Component;

/*  抽象构件:快餐类  */
public abstract class FastFood {
    private double price;
    private String desc;

    public FastFood(double price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    //因为只有具体的快餐才能决定价格
    public abstract double cost();
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
