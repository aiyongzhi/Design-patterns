package 面向对象一.operateFactory;

import 面向对象一.operate.Operate;
import 面向对象一.operate.addOperate;
import 面向对象一.operate.subOperate;

public class subOperateFactory extends operateFactory{
    //工厂应该是单例的
    private static final subOperateFactory INSTANCE=new subOperateFactory();
    private subOperateFactory(){}

    public static subOperateFactory getINSTANCE() {
        return INSTANCE;
    }
    @Override
    public  Operate createOperate() {
        return new subOperate();
    }
}
