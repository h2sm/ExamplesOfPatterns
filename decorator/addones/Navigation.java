package decorator.addones;

import decorator.abstractClasses.Car;
import decorator.abstractClasses.Addons;

public class Navigation implements Addons {
    Car car;
    public Navigation(Car car){
        this.car = car;
    }
    @Override
    public String returnName() {
        return car.returnName() + " + Navigation";
    }

    @Override
    public int returnPrice() {
        return car.returnPrice() + 15000;
    }
}
