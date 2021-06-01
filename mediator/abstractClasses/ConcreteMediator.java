package mediator.abstractClasses;

import mediator.colleagues.Alarm;
import mediator.colleagues.CoffeeMachine;
import mediator.colleagues.Curtains;
import mediator.colleagues.TV;

import java.util.HashMap;

public class ConcreteMediator implements Mediator {
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<>();
        interMap = new HashMap<>();
    }

    @Override
    public void Register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);


        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", colleagueName);
        }

    }

    @Override
    public void notifyEverything(int stateChange, String colleagueName) {

        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) (colleagueMap.get(interMap
                        .get("CoffeeMachine")))).startCoffee();
                ((TV) (colleagueMap.get(interMap.get("TV")))).startTv();
            }
            else if (stateChange == 1) {
                ((TV) (colleagueMap.get(interMap.get("TV")))).stopTv();
            }

        }
        else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            ((CoffeeMachine) (colleagueMap.get(interMap
                    .get("CoffeeMachine")))).startCoffee();
            ((Curtains) (colleagueMap.get(interMap.get("Curtains"))))
                    .upCurtains();

        }
        else if (colleagueMap.get(colleagueName) instanceof TV) {
            ((TV) (colleagueMap.get(interMap.get("TV"))))
                    .startTv();
            ((Curtains) (colleagueMap.get(interMap.get("Curtains"))))
                    .downCurtains();

        }
        else if (colleagueMap.get(colleagueName) instanceof Curtains) {

        }

    }

    @Override
    public void sendMessage() {

    }

}
