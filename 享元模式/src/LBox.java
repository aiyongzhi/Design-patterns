public class LBox extends AbstractBox{
    @Override
    public String getShape() {
        return "L";
    }

    @Override
    public void display(String color) {
        System.out.println("颜色为:"+color+"的L图形");
    }
}
