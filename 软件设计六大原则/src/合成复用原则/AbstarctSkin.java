package 合成复用原则;
/*汽车的皮肤*/
public abstract class AbstarctSkin {
    private final String color;

    public AbstarctSkin(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void show();
}
