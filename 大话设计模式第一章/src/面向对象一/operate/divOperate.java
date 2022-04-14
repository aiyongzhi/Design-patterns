package 面向对象一.operate;

public class divOperate extends Operate{
    private static final divOperate INSTANCE=new divOperate();
    private divOperate(){}

    public static divOperate getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public double calculate(double num1,  double num2) {
        return num1/num2;
    }
}
