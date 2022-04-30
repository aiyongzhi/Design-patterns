public abstract class HummerModel {
    protected abstract void start();//汽车发动
    protected abstract void engineBoom();//引擎轰隆隆响
    protected abstract void alarm();//汽车鸣笛
    protected abstract void stop();//汽车停车
    //钩子方法
    protected boolean isAlarm(){
        return true;
    }
    //汽车开跑方法
    public final void run(){
        this.start();
        this.engineBoom();
        if(isAlarm()){
            this.alarm();
        }
        this.stop();
    }

}
