public class RunningState extends LiftState {
    @Override
    public void open() {
    }

    @Override
    public void close() {
    }

    @Override
    public void stop() {
        System.out.println("电梯:运行-->停止");
        getContext().setState(Context.STOPPING_STATE);
    }
    @Override
    public void running() {
    }
}
