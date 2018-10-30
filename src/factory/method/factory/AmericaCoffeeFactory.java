package factory.method.factory;

import factory.method.coffee.ICoffee;
import factory.method.coffee.Latte;
import factory.method.coffee.Mocha;

/**
 * Created by wenzhi on 2018/10/30.
 */
public class AmericaCoffeeFactory implements ICoffeeFactory {
    @Override
    public ICoffee[] makeCoffee() {
        Latte latte = new Latte();
        Mocha mocha = new Mocha();
        System.out.println("美国制造：" + latte.coffee() + " 和 " + mocha.coffee());
        return new ICoffee[]{latte, mocha};
    }
}
