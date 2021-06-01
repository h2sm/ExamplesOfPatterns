package decorator.addones;

import decorator.abstractClasses.Car;
import decorator.abstractClasses.Addons;

public class LEDHeadlights implements Addons {
    Car car;
    public LEDHeadlights(Car car){
        this.car = car;
    }
    @Override
    public String returnName() {
        return car.returnName() + " + Led Headlights";
    }

    @Override
    public int returnPrice() {
        return car.returnPrice() + 40000;
    }
}
