public class Client {
    public static void main(String[] args) {
        //1:创建元素容器对象
        Home home=new Home();
        home.addAnimal(new Cat());
        home.addAnimal(new Dog());
        //2:创建访问者对象
        Person owner=new Owner();
        Person someone=new Someone();
        home.action(owner);
        System.out.println("===========================");
        home.action(someone);
    }
}
