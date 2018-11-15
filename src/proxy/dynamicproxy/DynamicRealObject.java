package proxy.dynamicproxy;

import proxy.IOperation;

/**
 * Created by wenzhi on 2018/11/15.
 */
public class DynamicRealObject implements IOperation {
    @Override
    public boolean operation() {
        System.out.println("dynamic proxy : real object operating...");
        return false;
    }
}
