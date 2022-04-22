package SmartApplianceSystemFacade;

import SmartHomeApplianceSystem.AirCondition;
import SmartHomeApplianceSystem.Light;
import SmartHomeApplianceSystem.TV;

public class SmartApplianceSystemFacade {
    private static final Light light;
    private static final TV tv;
    private static final AirCondition airCondition;
    static {
        light=new Light();
        tv=new TV();
        airCondition=new AirCondition();
    }
    /* 根据声音来控制家电*/
    public void say(String msg){
        if(msg==null||msg.length()==0){
            System.out.println("请说话!");
            return;
        }
        if(msg.contains("开灯")){
            light.on();
        }
        else if(msg.contains("关灯")){
            light.off();
        }
        else if(msg.contains("开电视")){
            tv.on();
        }
        else if(msg.contains("关电视")){
            tv.off();
        }
        else if(msg.contains("开空调")){
            airCondition.on();
        }
        else if(msg.contains("关空调")){
            airCondition.off();
        }
        else{
            System.out.println("我没听清，请您再说一次!");
        }

    }
}
