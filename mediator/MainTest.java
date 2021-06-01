package mediator;


import mediator.abstractClasses.ConcreteMediator;
import mediator.abstractClasses.Mediator;
import mediator.colleagues.Alarm;
import mediator.colleagues.CoffeeMachine;
import mediator.colleagues.Curtains;
import mediator.colleagues.TV;

public class MainTest {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Alarm mAlarm = new Alarm(mediator, "mAlarm");
        CoffeeMachine mCoffeeMachine = new CoffeeMachine(mediator,
                "mCoffeeMachine");
        Curtains mCurtains = new Curtains(mediator, "mCurtains");
        TV mTV = new TV(mediator, "mTV");
        mTV.sendMessage(0);
        System.out.println("\n");
        mAlarm.sendMessage(0);

    }

}
