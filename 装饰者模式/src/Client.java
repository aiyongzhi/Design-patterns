import Component.FastFood;
import Component.FriedRice;
import Decorator.Bacon;
import Decorator.Egg;

public class Client {
    public static void main(String[] args) {
        FastFood friedRice=new FriedRice();
        //单点一个炒饭
        System.out.println(friedRice.cost());
        System.out.println(friedRice.getDesc());

        System.out.println("============================");
        /* 现在要点炒饭加鸡蛋 */
        friedRice=new Egg(friedRice);
        System.out.println(friedRice.getDesc());
        System.out.println(friedRice.cost());
        System.out.println("=============================");
        //再加一个鸡蛋
        friedRice=new Egg(friedRice);
        System.out.println(friedRice.getDesc());
        System.out.println(friedRice.cost());
        System.out.println("=============================");
        //豪华版蛋炒饭 :再加一个培根
        friedRice=new Bacon(friedRice);
        System.out.println(friedRice.getDesc());
        System.out.println(friedRice.cost());
    }
}
