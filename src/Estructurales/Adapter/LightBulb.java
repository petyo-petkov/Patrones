package Estructurales.Adapter;

public class LightBulb {
    boolean poweredOn = false;
    int voltage = 0;

    public void turnOn(int voltage) {
        poweredOn = true;
        this.voltage = voltage;
        System.out.println("Lightbulb poweredOn " + voltage + " current");
    }
    public void turnOff() {
        poweredOn = false;
        this.voltage = 0;
        System.out.println("Lightbulb powered Off");
    }
    public boolean isPoweredOn() {
        return poweredOn;
    }
}
