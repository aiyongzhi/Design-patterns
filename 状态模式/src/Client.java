public class Client {
    public static void main(String[] args) {
        //1:定义一个Context角色
        Context context=new Context(Context.STOPPING_STATE);
        context.open();
        System.out.println("人进来了!");
        context.close();
        context.running();
        context.stop();
        System.out.println("到了!");
    }
}
