package 面向对象一.operateFactory;

import 面向对象一.operate.Operate;
import 面向对象一.operate.addOperate;

public class addOperateFactory extends operateFactory{
    //工厂应该是单例的
    private static final addOperateFactory INSTANCE=new addOperateFactory();
    private addOperateFactory(){}

    public static addOperateFactory getINSTANCE() {
        return INSTANCE;
    }
    @Override
    public  Operate createOperate() {
        return new addOperate();
    }
}
