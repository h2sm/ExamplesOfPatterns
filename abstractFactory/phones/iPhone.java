package abstractFactory.phones;

public class iPhone implements Phone {
    @Override
    public void call() {
        System.out.println("Calling from an iPhone.");
    }

    @Override
    public void openTwitter() {
        System.out.println("mmmmhhhmhm that blue bird app looks gorgeous on an iphone.");
    }
}
