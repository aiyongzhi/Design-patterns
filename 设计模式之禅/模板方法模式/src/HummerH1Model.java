public class HummerH1Model extends HummerModel{
    private boolean alarmFlag=true;
    @Override
    protected void start() {
        System.out.println("悍马H1启动了.........");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H1轰隆隆.........");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1喇嘛响.........");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1到达目的地,停车......");
    }

    public void setAlarmFlag(boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }
}
