public class PlaneFactory extends VehicleFactory {
    /*工厂应该是单例*/
    private static final PlaneFactory INSTANCE=new PlaneFactory();
    private PlaneFactory(){}

    public static PlaneFactory getINSTANCE() {
        return INSTANCE;
    }
    @Override
    public Movable create() {
        /*
        * 写业务逻辑，给生产的车加装饰等信息
        * */
        return new Plane();
    }
}
