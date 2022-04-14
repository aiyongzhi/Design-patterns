package 面向对象一;

import 面向对象一.operate.*;
import 面向对象一.operateFactory.*;

//代码重构 进一步降低耦合度，将不同的运算全部分离
//支持两个数的加减乘除功能，你必须指定什么类型的数据运算
public class Calculator {
    private double calculate(Operate operate,double num1,double num2){
        return operate.calculate(num1,num2);
    }
    public double calculate(double num1, String operate, double num2){
        double res;
        switch (operate){
            case "+":
                res=calculate(addOperateFactory.getINSTANCE().createOperate(),num1,num2);
                break;
            case "-":
                res=calculate(subOperateFactory.getINSTANCE().createOperate(), num1,num2);
                break;
            case "*":
                res=calculate(multiOperateFactory.getINSTANCE().createOperate(), num1,num2);
                break;
            case "/":
                if(num2==0){
                    throw new IllegalArgumentException("除数不能为0!");
                }
                res=calculate(divOperateFactory.getINSTANCE().createOperate(), num1,num2);
                break;
            default:
                throw new RuntimeException("运算符必须为 + - * /");
        }
        return res;
    }
}
