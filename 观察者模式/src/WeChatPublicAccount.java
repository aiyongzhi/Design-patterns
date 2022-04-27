import java.util.ArrayList;
import java.util.List;

public class WeChatPublicAccount implements Subject{
    //定义一个观察者集合
    private final List<Observe> weiXinUserList=new ArrayList<>();
    @Override
    public void attach(Observe observe) {
        weiXinUserList.add(observe);
    }
    @Override
    public void detach(Observe observe) {
        weiXinUserList.remove(observe);
    }

    @Override
    public void notify(String msg) {
        for(Observe observe:weiXinUserList){
            observe.update(msg);
        }
    }
}
