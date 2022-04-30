public class HummerH2Model extends HummerModel{
    @Override
    protected void start() {
        System.out.println("悍马H2启动了.........");

    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2轰隆隆.........");

    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2喇嘛响.........");

    }

    @Override
    protected void stop() {
        System.out.println("悍马H2到达目的地,停车......");

    }

    @Override
    protected boolean isAlarm() {
        return false;
    }
}
