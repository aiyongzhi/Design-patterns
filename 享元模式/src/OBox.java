/* 具体享元对象:O图形   */
public class OBox extends AbstractBox{
    @Override
    public String getShape() {
        return "O";
    }

    @Override
    public void display(String color) {
        System.out.println("颜色:"+color+"的O图形");
    }
}
