public class OpeningState extends LiftState{
    @Override
    public void open() {
    }
    @Override
    public void close() {
        System.out.println("电梯门:开启-->关闭");
        getContext().setState(Context.CLOSING_STATE);
    }
    @Override
    public void stop() {
    }
    @Override
    public void running() {
    }
}
