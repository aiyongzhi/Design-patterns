package 对象适配器模式;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        CDCardImpl cd = new CDCardImpl();
        System.out.println(computer.readCard(cd));
        System.out.println("==========================");
        TFCardImpl tf = new TFCardImpl();
        CDAdapterTF adapterTF = new CDAdapterTF(tf);
        computer.readCard(adapterTF);
        System.out.println("==========================");
        computer.writeCard(adapterTF,"helloWord!");
    }
}
