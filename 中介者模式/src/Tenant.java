public class Tenant extends Person{
    public Tenant(Mediator mediator, String name) {
        super(mediator, name);
    }
    @Override
    public void getMessage(String msg) {
        System.out.println("名为"+this.getName()+"的租房者收到信息: "+msg);
    }
}
