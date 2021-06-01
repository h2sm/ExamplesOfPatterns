package decorator;

import decorator.abstractClasses.Car;
import decorator.addones.LEDHeadlights;
import decorator.addones.Navigation;
import decorator.cars.Outlander;
import decorator.cars.RAV4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new RAV4();
        System.out.println(car1.returnName() + " " + car1.returnPrice());
        car1 = new LEDHeadlights(car1);
        System.out.println(car1.returnName() + " " + car1.returnPrice());
        car1 = new Navigation(car1);
        System.out.println(car1.returnName() + " " + car1.returnPrice() + "\n");
        Car car2 = new Outlander();
        System.out.println(car2.returnName() + " " + car2.returnPrice());
        car2 = new Navigation(car2);
        System.out.println(car2.returnName() + " " + car2.returnPrice());
        car2 = new LEDHeadlights(car2);
        System.out.println(car2.returnName() + " " + car2.returnPrice());


    }
}
