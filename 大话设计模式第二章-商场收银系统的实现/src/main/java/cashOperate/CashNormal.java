package cashOperate;

public class CashNormal implements CashStrategy{

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
