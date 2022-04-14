package CashOperateFactory;

import cashOperate.CashNormal;
import cashOperate.CashOperate;
import cashOperate.CashRebate;
import cashOperate.CashReturn;

/* 方法工厂 */
public class CashFactory {
    private CashFactory(){}
    public static CashNormal createCashNormal(){
        return new CashNormal();
    }
    public static CashRebate createCashRebate(double moneyRebate){
        return new CashRebate(moneyRebate);
    }
    public static CashReturn createCashReturn(double moneyCondition,double moneyReturn){
        return new CashReturn(moneyCondition,moneyReturn);
    }
}
