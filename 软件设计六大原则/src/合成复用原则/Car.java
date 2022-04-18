package 合成复用原则;

public class Car {
    private final AbstarctSkin skin;
    private final Energy energy;

    public Car(AbstarctSkin skin, Energy energy) {
        this.skin = skin;
        this.energy = energy;
    }

    public AbstarctSkin getSkin() {
        return skin;
    }

    public Energy getEnergy() {
        return energy;
    }
    public void move(){
        energy.launch();
        System.out.println("汽车正在行驶!");
        skin.show();
    }
}
