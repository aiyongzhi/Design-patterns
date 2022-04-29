import java.util.ArrayList;
import java.util.List;

public class WeChatPublicAccount implements Subject{
    //定义一个观察者集合
    private final List<Observe> weiXinUserList=new ArrayList<>();
    @Override
    public void attach(Observe observe) {
        if(observe==null){
            throw new NullPointerException("observe对象不能为空");
        }
        if(weiXinUserList.contains(observe)){
            return;
        }
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
