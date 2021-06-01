package decorator.cars;

import decorator.abstractClasses.Car;

public class Outlander implements Car {
    @Override
    public int returnPrice() {
        return 1900000;
    }

    @Override
    public String returnName() {
        return "Mitsubishi Outlander";
    }
}
