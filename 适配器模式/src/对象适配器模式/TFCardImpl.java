package 对象适配器模式;

public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        return "电脑从TFCard中读取的数据";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("电脑向TFCard中写入了数据"+msg);
    }
}
