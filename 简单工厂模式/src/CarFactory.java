public class CarFactory extends VehicleFactory {
    /*工厂应该是单例*/
    private static final CarFactory INSTANCE=new CarFactory();
    private CarFactory(){}

    public static CarFactory getINSTANCE() {
        return INSTANCE;
    }
    @Override
    public Movable create() {
        /*
        * 写业务逻辑，给生产的车加装饰等信息
        * */
        return new Car();
    }
}
