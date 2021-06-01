package abstractFactory.factories;

import abstractFactory.cases.Case;
import abstractFactory.cases.iPhoneCase;
import abstractFactory.phones.Phone;
import abstractFactory.phones.iPhone;

public class iPhoneFactory implements PhoneFactory {
    @Override
    public Phone buyPhone() {
        return new iPhone();
    }

    @Override
    public Case buyCase() {
        return new iPhoneCase();
    }
}
