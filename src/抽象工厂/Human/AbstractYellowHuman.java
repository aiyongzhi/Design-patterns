package 抽象工厂.Human;

public abstract class AbstractYellowHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黄色人在大笑!");
    }

    @Override
    public void cry() {
        System.out.println("黄色人在哭!");
    }

    @Override
    public void talk() {
        System.out.println("黄色人在说话!");
    }
}
