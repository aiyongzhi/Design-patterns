package service;

import CashOperateFactory.CashFactory;
import cashOperate.CashStrategy;

public class finallyCash {
    //利用多态，提高代码的可复用性，拓展性，可维护性
    private static double calculate(CashStrategy cashOperate, int totalPrice){
        return cashOperate.acceptCash(totalPrice);
    }
    public static double discount(String type,int totalPrice){
        double result=0d;
        switch (type){
            case "正常收费":
                result=calculate(CashFactory.createCashNormal(),totalPrice);
                break;
            case "打八折":
                result=calculate(CashFactory.createCashRebate(0.8),totalPrice);
                break;
            case "打九折":
                result=calculate(CashFactory.createCashRebate(0.9),totalPrice);
                break;
            case "满100减10":
                result=calculate(CashFactory.createCashReturn(100,10),totalPrice);
                break;
            case "满200减30":
                result=calculate(CashFactory.createCashReturn(200,30),totalPrice);
                break;
        }
        return result;
    }
}
