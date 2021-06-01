package abstractFactory;

import abstractFactory.application.App;
import abstractFactory.application.Demo;

public class Main {
    //данный код создает фабрику магазина, где можно купить телефон и чехол к нему. так же с телефоном можно взаимодействовать
    //для проверки его работоспособности
    public static void main(String[] args) {
        App app = new Demo().demonstration(0);
        app.doStuff();
        System.out.println("---------------");
        App app1 = new Demo().demonstration(1);
        app1.doStuff();
    }
}
