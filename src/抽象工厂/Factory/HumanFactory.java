package 抽象工厂.Factory;

import 抽象工厂.Human.Human;

public interface HumanFactory {
    public Human createYellowHuman();
    public Human createBlackHuman();
    public Human createWhiteHuman();
}
