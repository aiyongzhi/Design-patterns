/* 抽象同事类 */
public abstract class Person {
    private Mediator mediator;
    private String name;

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    //和中介者说话，让中介者协调
    public void attach(String msg){
        mediator.attach(msg,this);
    }
    //接收中介者传过来的信息
    public abstract void getMessage(String msg);
}
