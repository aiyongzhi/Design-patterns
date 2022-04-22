package 对象适配器模式;

public class CDCardImpl implements CDCard{
    @Override
    public String readCD() {
        return "电脑从CDCard中读取了数据";
    }
    @Override
    public void writeCD(String msg) {
        System.out.println("电脑向CDCard中写入了"+msg);
    }
}
