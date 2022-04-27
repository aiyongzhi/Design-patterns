public class StoppingState extends LiftState{
    @Override
    public void open() {
        System.out.println("电梯:暂停-->开门");
        getContext().setState(Context.OPENING_STATE);
    }
    @Override
    public void close() {
        System.out.println("电梯:暂停-->关门");
        getContext().setState(Context.CLOSING_STATE);
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
