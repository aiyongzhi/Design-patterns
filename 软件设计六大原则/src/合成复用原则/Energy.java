package 合成复用原则;

public abstract class Energy {
    private final String name;

    public Energy(String name) {
        this.name = name;
    }
    public abstract void launch();
    public String getName() {
        return name;
    }
}
