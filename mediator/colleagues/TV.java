package mediator.colleagues;

import mediator.abstractClasses.Colleague;
import mediator.abstractClasses.Mediator;

public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().notifyEverything(stateChange, this.name);
    }

    public void startTv() {
        System.out.println("TV is turned on.");
    }

    public void stopTv() {
        System.out.println("TV is turned off.");
    }
}
