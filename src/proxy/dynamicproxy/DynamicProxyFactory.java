package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by wenzhi on 2018/11/15.
 */
public class DynamicProxyFactory {

    public static Object getProxyInstance(final Object targetObj) {
        return Proxy.newProxyInstance(targetObj.getClass().getClassLoader(), targetObj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("dynamic proxy : proxy begin...");
                System.out.println("generate proxy type : " + proxy.getClass());
                Object resultVal = method.invoke(targetObj, args);
                System.out.println("real obj method return val : " + resultVal);
                System.out.println("dynamic proxy : proxy end...");

                return resultVal;
            }
        });
    }
}
