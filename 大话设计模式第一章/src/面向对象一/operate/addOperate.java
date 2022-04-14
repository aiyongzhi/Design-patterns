package 面向对象一.operate;

public class addOperate extends Operate{
    //写成单例
    private static final addOperate INSTANCE=new addOperate();
    private addOperate(){}

    public static addOperate getINSTANCE() {
        return INSTANCE;
    }
    @Override
    public double calculate(double num1, double num2) {
        return num1-num2;
    }
}
