package 简单工厂和配置文件;

public class LatteCoffee implements Coffee{
    private final String name="蓝山咖啡";
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void addMike() {
        System.out.println("加牛奶!");
    }

    @Override
    public void addSugar() {
        System.out.println("加糖!");

    }
}
