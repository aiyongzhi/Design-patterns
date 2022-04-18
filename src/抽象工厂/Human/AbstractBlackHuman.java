package 抽象工厂.Human;

public abstract class AbstractBlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黑人在笑");
    }

    @Override
    public void cry() {
        System.out.println("黑人在哭");
    }

    @Override
    public void talk() {
        System.out.println("黑人在说话");
    }
}
