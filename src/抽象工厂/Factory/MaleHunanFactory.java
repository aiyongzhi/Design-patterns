package 抽象工厂.Factory;

import 抽象工厂.Human.*;

public class MaleHunanFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new YellowMaleHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new BlackMaleHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new WhiteMaleHuman();
    }
}
