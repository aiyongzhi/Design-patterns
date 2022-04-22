import SmartApplianceSystemFacade.SmartApplianceSystemFacade;

public class Client {
    public static void main(String[] args) {
        SmartApplianceSystemFacade facade=new SmartApplianceSystemFacade();

        facade.say("给老子打开电视机!");
        System.out.println("======================");
        facade.say("赶快开灯!");
        System.out.println("======================");
        facade.say("关电视");
    }
}
