/* 状态模式:抽象状态 */
public abstract class LiftState {
    private Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    public abstract void open();
    public abstract void close();
    public abstract void stop();
    public abstract void running();
}
