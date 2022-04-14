package 面向对象一;

import 面向对象一.calculatorFactory.calculatorFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String num1;
        String operate;
        String num2;
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("请输入运算的第一个数据");
            num1=reader.readLine();
            System.out.println("请输入运算符号!");
            operate=reader.readLine();
            System.out.println("请输入第二个数据");
            num2=reader.readLine();
            Calculator calculator= calculatorFactory.getINSTANCE().createCalculator();
            double res= calculator.calculate(Double.parseDouble(num1), operate, Double.parseDouble(num2));
            System.out.println(res);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
