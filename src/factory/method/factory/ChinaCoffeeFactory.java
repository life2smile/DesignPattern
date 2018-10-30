package factory.method.factory;

import factory.method.coffee.Cappuccino;
import factory.method.coffee.ICoffee;
import factory.method.coffee.Mocha;

/**
 * Created by wenzhi on 2018/10/30.
 */
public class ChinaCoffeeFactory implements ICoffeeFactory {
    @Override
    public ICoffee[] makeCoffee() {
        Cappuccino cappuccino = new Cappuccino();
        Mocha mocha = new Mocha();
        System.out.println("中国制造：" + cappuccino.coffee() + " 和 " + mocha.coffee());
        return new ICoffee[]{cappuccino, mocha};
    }
}
