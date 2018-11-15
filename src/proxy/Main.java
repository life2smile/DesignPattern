package proxy;

import proxy.dynamicproxy.DynamicProxyFactory;
import proxy.dynamicproxy.DynamicRealObject;
import proxy.staticproxy.StaticProxyObject;
import proxy.staticproxy.StaticRealObject;

/**
 * Created by wenzhi on 2018/11/15.
 */
public class Main {

    public static void main(String[] args) {
        testStaticProxy();
        testDynamicProxy();
    }

    private static void testStaticProxy() {
        IOperation proxyObj = new StaticProxyObject(new StaticRealObject());
        proxyObj.operation();
    }

    private static void testDynamicProxy(){
       IOperation proxyObject = (IOperation) DynamicProxyFactory.getProxyInstance(new DynamicRealObject());
        proxyObject.operation();
    }
}
