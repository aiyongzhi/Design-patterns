public class IBox extends AbstractBox{
    @Override
    public String getShape() {
        return "I";
    }

    @Override
    public void display(String color) {
        System.out.println("颜色为:"+color+"的I图形");
    }
}
