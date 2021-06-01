package abstractFactory.application;

import abstractFactory.cases.Case;
import abstractFactory.factories.PhoneFactory;
import abstractFactory.phones.Phone;

public class App {
    private Case newCase;
    private Phone newPhone;

    public App(PhoneFactory pf){
        this.newCase = pf.buyCase();
        this.newPhone = pf.buyPhone();
    }
    public void doStuff(){
        newPhone.call();
        newPhone.openTwitter();
        newCase.putTheCase();
    }
}
