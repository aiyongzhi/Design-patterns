package 对象适配器模式;

public class Computer {
    public String readCard(CDCard card){
        return card.readCD();
    }
    public void writeCard(CDCard card,String msg){
        card.writeCD(msg);
    }
}
