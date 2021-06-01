package abstractFactory.factories;

import abstractFactory.cases.Case;
import abstractFactory.phones.Phone;

public interface PhoneFactory {
    Phone buyPhone();
    Case buyCase();
}
