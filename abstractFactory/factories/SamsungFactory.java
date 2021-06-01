package abstractFactory.factories;

import abstractFactory.cases.Case;
import abstractFactory.cases.SamsungCase;
import abstractFactory.phones.Phone;
import abstractFactory.phones.Samsung;

public class SamsungFactory implements PhoneFactory {
    @Override
    public Phone buyPhone() {
        return new Samsung();
    }

    @Override
    public Case buyCase() {
        return new SamsungCase();
    }
}
