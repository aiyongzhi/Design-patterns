package 合成复用原则;

public class Petrol extends Energy{
    public Petrol(String name) {
        super(name);
    }

    @Override
    public void launch() {
        System.out.println(getName()+"正在发动汽车!");
    }
}
