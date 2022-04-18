package 抽象工厂.Human;

public class WhiteMaleHuman extends AbstractBlackHuman{
    @Override
    public void sex() {
        System.out.println("该白色人是.....男");
    }
}
