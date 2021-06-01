package mediator.colleagues;


import mediator.abstractClasses.Colleague;
import mediator.abstractClasses.Mediator;

public class Alarm extends Colleague {

	public Alarm(Mediator mediator, String name) {
		super(mediator, name);
		mediator.Register(name, this);
	}

	@Override
	public void sendMessage(int stateChange) {
		this.getMediator().notifyEverything(stateChange, this.name);
	}

}
