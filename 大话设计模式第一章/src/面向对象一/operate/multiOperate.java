package 面向对象一.operate;

public class multiOperate extends Operate{
    private static final multiOperate INSTANCE=new multiOperate();
    private multiOperate(){}

    public static multiOperate getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public double calculate(double num1, double num2) {
        return num1*num2;
    }
}
