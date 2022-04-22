package Component;

/* 具体构件:炒饭类   */
public class FriedRice extends FastFood{
    public FriedRice() {
        super(10, "炒饭");
    }
    @Override
    public double cost() {
        return this.getPrice();
    }
}
