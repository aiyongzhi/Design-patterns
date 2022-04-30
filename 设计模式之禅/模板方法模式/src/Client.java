public class Client {
    public static void main(String[] args) {
        HummerH1Model hummerModel1=new HummerH1Model();
        hummerModel1.run();
        System.out.println("=======================");
        hummerModel1.setAlarmFlag(false);
        hummerModel1.run();
        System.out.println("=======================");
        HummerH2Model hummerH2Model=new HummerH2Model();
        hummerH2Model.run();
    }
}
