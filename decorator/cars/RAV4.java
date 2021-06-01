package decorator.cars;

import decorator.abstractClasses.Car;

public class RAV4 implements Car {
    @Override
    public int returnPrice() {
        return 2100000;
    }

    @Override
    public String returnName() {
        return "Toyota RAV4";
    }
}
