/* 具体观察者对象 */
public class WeiXinUser implements Observe{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(this.name+"-接收到了公众号更新的文章:"+msg);
    }
}
