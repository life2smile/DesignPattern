package proxy.staticproxy;

import proxy.IOperation;

/**
 * Created by wenzhi on 2018/11/15.
 */
public class StaticProxyObject implements IOperation {
    private IOperation mRealObject;

    public StaticProxyObject(IOperation realObject) {
        this.mRealObject = realObject;
    }

    @Override
    public boolean operation() {
        System.out.println("static proxy : proxy begin...");
        mRealObject.operation();
        System.out.println("static proxy : proxy end...");
        return true;
    }
}
