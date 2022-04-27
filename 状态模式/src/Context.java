public class Context {
    private LiftState state;
    /* 定义四个状态的常量 */
    public static final OpeningState OPENING_STATE=new OpeningState();
    public static final ClosingState CLOSING_STATE=new ClosingState();
    public static final RunningState RUNNING_STATE=new RunningState();
    public static final StoppingState STOPPING_STATE=new StoppingState();


    public LiftState getState() {
        return state;
    }
    public void setState(LiftState state) {
        this.state = state;
    }

    public Context(LiftState state) {
        this.state = state;
        OPENING_STATE.setContext(this);
        CLOSING_STATE.setContext(this);
        RUNNING_STATE.setContext(this);
        STOPPING_STATE.setContext(this);
    }
    public void open(){
        state.open();
    }
    public void close(){
        state.close();
    }
    public void stop(){
        state.stop();
    }
    public void running(){
        state.running();
    }
}
