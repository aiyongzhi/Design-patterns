package 面向对象一.operateFactory;

import 面向对象一.operate.Operate;
import 面向对象一.operate.addOperate;
import 面向对象一.operate.multiOperate;

public class multiOperateFactory extends operateFactory{
    //工厂应该是单例的
    private static final multiOperateFactory INSTANCE=new multiOperateFactory();
    private multiOperateFactory(){}

    public static multiOperateFactory getINSTANCE() {
        return INSTANCE;
    }
    @Override
    public  Operate createOperate() {
        return new multiOperate();
    }
}
