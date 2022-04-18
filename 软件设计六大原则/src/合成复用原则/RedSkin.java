package 合成复用原则;

public class RedSkin extends AbstarctSkin{
    public RedSkin(String color) {
        super(color);
    }

    @Override
    public void show() {
        System.out.println(getColor()+"颜色的汽车正在跑!");
    }
}
