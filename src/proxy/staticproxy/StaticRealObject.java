package proxy.staticproxy;

import proxy.IOperation;

/**
 * Created by wenzhi on 2018/11/15.
 */
public class StaticRealObject implements IOperation {
    @Override
    public boolean operation() {
        System.out.println("static proxy : real object operating...");
        return true;
    }
}
