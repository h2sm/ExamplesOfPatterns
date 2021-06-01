package abstractFactory.phones;

public class Samsung implements Phone{
    @Override
    public void call() {
        System.out.println("Calling from a Samsung.");
    }

    @Override
    public void openTwitter() {
        System.out.println("Twitter is working okay");
    }
}
