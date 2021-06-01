package mediator.abstractClasses;


import mediator.abstractClasses.Colleague;

public interface Mediator {
   void Register(String colleagueName, Colleague colleague);

    void notifyEverything(int stateChange, String colleagueName);

    void sendMessage();
}
