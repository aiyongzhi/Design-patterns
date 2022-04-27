/* 抽象主题对象 */
public interface Subject {
    //1:添加关注者
    void attach(Observe observe);
    //2:取消关注
    void detach(Observe observe);

    //3:把更新的内容推送给关注本公众号的用户
    void notify(String msg);
}
