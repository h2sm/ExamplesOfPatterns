package mediator.colleagues;

import mediator.abstractClasses.Colleague;
import mediator.abstractClasses.Mediator;

public class Curtains extends Colleague {

	public Curtains(Mediator mediator, String name) {
		super(mediator, name);
		mediator.Register(name, this);
	}

	@Override
	public void sendMessage(int stateChange) {
		this.getMediator().notifyEverything(stateChange, this.name);
	}

	public void upCurtains() {
		System.out.println("Opening Curtains");
	}
	public void downCurtains(){
		System.out.println("Closing curtains");
	}

}
