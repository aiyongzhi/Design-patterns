public class ClosingState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门:关闭-->开启");
        getContext().setState(Context.OPENING_STATE);
    }

    @Override
    public void close() {
    }

    @Override
    public void stop() {
    }

    @Override
    public void running() {
        System.out.println("电梯:暂停-->运行");
        getContext().setState(Context.RUNNING_STATE);
    }
}
