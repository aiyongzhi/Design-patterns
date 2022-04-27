public class HouseOwner extends Person {
    public HouseOwner(Mediator mediator, String name) {
        super(mediator, name);
    }
    @Override
    public void getMessage(String msg) {
        System.out.println("名为"+this.getName()+"的房主收到信息: "+msg);
    }
}
