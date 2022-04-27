public class Client {
    public static void main(String[] args) {
        //1:创建具体实体类:微信公众号
        Subject subject=new WeChatPublicAccount();
        //2:添加观察者
        Observe zhangSan=new WeiXinUser("张三");
        Observe liSi=new WeiXinUser("李四");
        //3:让观察者关注这个微信公众号
        subject.attach(zhangSan);
        subject.attach(liSi);
        //4:公众号推送文章
        subject.notify("每日英语-俄乌克冲突");
    }
}
