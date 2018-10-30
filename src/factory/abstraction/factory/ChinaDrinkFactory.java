package factory.abstraction.factory;

import factory.abstraction.drinks.coffee.ICoffee;
import factory.abstraction.drinks.coffee.Mocha;
import factory.abstraction.drinks.tea.BlackTea;
import factory.abstraction.drinks.tea.GreenTea;
import factory.abstraction.drinks.tea.ITea;

/**
 * Created by wenzhi on 2018/10/30.
 */
public class ChinaDrinkFactory extends AbstractDrinkFactory {
    @Override
    public ITea[] createTea() {
        GreenTea greenTea = new GreenTea();
        BlackTea blackTea = new BlackTea();
        System.out.println("中国工厂生茶：" + greenTea.tea() + " 和 " + blackTea.tea());
        return new ITea[]{greenTea, blackTea};
    }

    @Override
    public ICoffee[] createCoffee() {
        Mocha mocha = new Mocha();
        System.out.println("中国工厂生产的咖啡种类：" + mocha.coffee());
        return new ICoffee[]{mocha};
    }
}
