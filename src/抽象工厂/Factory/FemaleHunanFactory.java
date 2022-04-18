package 抽象工厂.Factory;

import 抽象工厂.Human.BlackFemaleHuman;
import 抽象工厂.Human.Human;
import 抽象工厂.Human.WhiteFemaleHuman;
import 抽象工厂.Human.YellowFemaleHuman;

public class FemaleHunanFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new YellowFemaleHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new BlackFemaleHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new WhiteFemaleHuman();
    }
}
