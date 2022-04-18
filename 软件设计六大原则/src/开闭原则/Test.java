package 开闭原则;

public class Test {
    public static void main(String[] args) {
        //1:创建皮肤对象
        AbstractSkin skin1=new DefaultSkin();
        AbstractSkin skin2=new HeimaSkin();
        AbstractSkin skin3=new ChuanZhiSkin();
        SougouInput sougouInput=new SougouInput(skin1);
        sougouInput.display();
        System.out.println("================");
        sougouInput.setSkin(skin2);
        sougouInput.display();
        System.out.println("=================");
        sougouInput.setSkin(skin3);
        sougouInput.display();

    }
}
