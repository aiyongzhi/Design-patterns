import java.util.HashMap;

public class BoxFactory {
    private BoxFactory(){}
    private static final BoxFactory INSTANCE =new BoxFactory();


    public static BoxFactory getInstance() {
        return INSTANCE;
    }
    //类似于线程池:如果去工厂中拿取享元对象的时候如果有直接拿没有就创建
    //提高了对象的重复利用率,减少了资源的浪费
    public static final HashMap<String, AbstractBox> boxPool=new HashMap<>();
    static {
        boxPool.put("I",new IBox());
        boxPool.put("L",new LBox());
        boxPool.put("O",new OBox());
    }
    public AbstractBox getBox(String shape){
        if(shape==null||shape.equals("")){
            return null;
        }
        return boxPool.get(shape);
    }
}
