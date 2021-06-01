package mediator.colleagues;

import mediator.abstractClasses.Colleague;
import mediator.abstractClasses.Mediator;

public class CoffeeMachine extends Colleague {

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().notifyEverything(stateChange, this.name);
    }

    public void startCoffee() {
        System.out.println("It's time to startcoffee!");
    }

    public void finishCoffee() {

        System.out.println("After 5 minutes!");
        System.out.println("Coffee is ok!");
        sendMessage(0);
    }
}
