package Component;

/* 具体构件:炒饭类   */
public class FriedNoodles extends FastFood{
    public FriedNoodles() {
        super(10, "炒面");
    }
    @Override
    public double cost() {
        return this.getPrice();
    }
}
