package abstractFactory.application;

import abstractFactory.factories.PhoneFactory;
import abstractFactory.factories.SamsungFactory;
import abstractFactory.factories.iPhoneFactory;

public class Demo {
    private App app;
    private PhoneFactory pf;
    public App demonstration(int type){
        if (type == 0) {
            pf = new iPhoneFactory();
            app = new App(pf);
        }
        else {
            pf = new SamsungFactory();
            app = new App(pf);
        }
        return app;
    }
}
