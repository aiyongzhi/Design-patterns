package 合成复用原则;

public class Test {
    public static void main(String[] args) {
        //1:准备好汽车驱动
        Energy energy1=new Petrol("汽油汽车!");
        Energy energy2=new Electric("电动汽车!");
        AbstarctSkin skin1=new RedSkin("红色");
        AbstarctSkin skin2=new WhiteSkin("白色");
        Car car1=new Car(skin1,energy1);
        car1.move();
        System.out.println("==================");
        new Car(skin1,energy2).move();

    }
}
