package factory.abstraction.factory;

import factory.abstraction.drinks.coffee.ICoffee;
import factory.abstraction.drinks.tea.ITea;

/**
 * Created by wenzhi on 2018/10/30.
 */
public abstract class AbstractDrinkFactory {
    public abstract ITea[] createTea();

    public abstract ICoffee[] createCoffee();
}
