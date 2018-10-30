package factory.abstraction.factory;

import factory.abstraction.drinks.coffee.Cappuccino;
import factory.abstraction.drinks.coffee.ICoffee;
import factory.abstraction.drinks.coffee.Mocha;
import factory.abstraction.drinks.tea.GreenTea;
import factory.abstraction.drinks.tea.ITea;

/**
 * Created by wenzhi on 2018/10/30.
 */
public class AmericaDrinkFactory extends AbstractDrinkFactory {
    @Override
    public ITea[] createTea() {
        GreenTea greenTea = new GreenTea();
        System.out.println("美国工厂生产的茶种类：" + greenTea.tea());
        return new ITea[]{greenTea};
    }

    @Override
    public ICoffee[] createCoffee() {
        Cappuccino cappuccino = new Cappuccino();
        Mocha mocha = new Mocha();
        System.out.println("美国工厂生产的咖啡种类：" + cappuccino.coffee() + " 和 " + mocha.coffee());
        return new ICoffee[]{cappuccino, mocha};
    }
}
