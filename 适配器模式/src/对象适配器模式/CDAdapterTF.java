package 对象适配器模式;

public class CDAdapterTF implements CDCard{
    private final TFCard tf;

    public CDAdapterTF(TFCard tf) {
        this.tf = tf;
    }

    public TFCard getTf() {
        return tf;
    }

    @Override
    public String readCD() {
        return tf.readTF();
    }

    @Override
    public void writeCD(String msg) {
        tf.writeTF(msg);
    }
}
