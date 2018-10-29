package facade;

import facade.subsystem.Service1;
import facade.subsystem.Service2;

/**
 * Created by wenzhi on 2018/10/29.
 */
public class ServiceFacade {
    public void init() {
        System.out.println("...all service begin init ...");
        new Service1().init();
        new Service2().init();
        System.out.println("...all service init end...");
    }

}
