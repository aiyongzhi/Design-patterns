package 面向对象一.operate;

public class subOperate extends Operate{
    private static final subOperate INSTANCE=new subOperate();
    private subOperate(){}

    public static subOperate getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public double calculate(double num1, double num2) {
        return num1-num2;
    }
}
