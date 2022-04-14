public class Main {
    public static void main(String[] args) {
        People zhangsan=new People("张三");
        People lisi=new People("李四");
        zhangsan.go(CarFactory.getINSTANCE().create());
        lisi.go(PlaneFactory.getINSTANCE().create());
    }
}
