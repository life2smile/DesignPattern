package factory.method.coffee;

/**
 * Created by wenzhi on 2018/10/30.
 */
public class Latte implements ICoffee {
    @Override
    public String coffee() {
        return "拿铁";
    }
}
