public class Client {
    public static void main(String[] args) {
        BoxFactory factory = BoxFactory.getInstance();
        AbstractBox IBox= factory.getBox("I");
        IBox.display("红色");
        System.out.println("==============================");
        AbstractBox LBox= factory.getBox("L");
        LBox.display("紫色");
        System.out.println("==============================");
        AbstractBox OBox= factory.getBox("O");
        OBox.display("黄色");
        System.out.println("==============================");
        AbstractBox IBox2=factory.getBox("I");
        System.out.println(IBox==IBox2);
    }
}
