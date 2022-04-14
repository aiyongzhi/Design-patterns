package 面向对象一.operateFactory;

import 面向对象一.operate.Operate;
import 面向对象一.operate.addOperate;
import 面向对象一.operate.divOperate;

public class divOperateFactory extends operateFactory{
    //工厂应该是单例的
    private static final divOperateFactory INSTANCE=new divOperateFactory();
    private divOperateFactory(){}

    public static divOperateFactory getINSTANCE() {
        return INSTANCE;
    }
    @Override
    public  Operate createOperate() {
        return new divOperate();
    }
}
