package 面向对象一.calculatorFactory;

import 面向对象一.Calculator;

public class calculatorFactory {
    private static final calculatorFactory INSTANCE=new calculatorFactory();
    private calculatorFactory(){}

    public static calculatorFactory getINSTANCE() {
        return INSTANCE;
    }
    public Calculator createCalculator(){
        return new Calculator();
    }
}
