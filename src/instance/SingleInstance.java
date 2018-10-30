package instance;

import java.io.Serializable;

/**
 * Created by wenzhi on 2018/10/30.
 */
public final class SingleInstance implements Serializable {
    private SingleInstance() {
        if (SingleInstanceHolder.sInstance != null) {
            throw new RuntimeException("already have a instance...");
        }
    }


    public static SingleInstance instance() {
        return SingleInstanceHolder.sInstance;
    }


    private static class SingleInstanceHolder {
        private static final SingleInstance sInstance = new SingleInstance();
    }


    private Object readResolve() {
        return SingleInstance.instance();
    }

}
