package 合成复用原则;

public class WhiteSkin extends AbstarctSkin {
    public WhiteSkin(String color) {
        super(color);
    }

    @Override
    public void show() {
        System.out.println(getColor()+"正在奔驰!");
    }
}
