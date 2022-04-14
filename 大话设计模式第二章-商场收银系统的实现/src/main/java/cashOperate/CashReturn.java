package cashOperate;

/*这个返现的算法是每满多少返还多少*/
public class CashReturn implements CashStrategy{
    private final double moneyCondition;
    private final double moneyReturn;
    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }
    @Override
    public double acceptCash(double money) {
        if(money>=moneyCondition){
            return money-moneyReturn;
        }
        return money;
    }
}
