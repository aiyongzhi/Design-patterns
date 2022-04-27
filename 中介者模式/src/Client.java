public class Client {
    public static void main(String[] args) {
        //1:定义一个房屋中介
        Mediator mediator=new MediatorImpl();
        //2:定义一个房主
        HouseOwner owner=new HouseOwner(mediator,"张三");
        //3:定义一个租房者
        Tenant tenant=new Tenant(mediator,"李四");
        mediator.setHouseOwner(owner);
        mediator.setTenant(tenant);

        //现在租房者要找房
        tenant.attach("我要找一个一室两居的房子");
        owner.attach("我这里有你想要的房源，您要租吗?");
    }
}
