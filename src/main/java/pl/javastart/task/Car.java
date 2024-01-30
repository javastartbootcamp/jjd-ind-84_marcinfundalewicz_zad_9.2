package pl.javastart.task;

public class Car extends  Vehicle {
    private static final double AC_ADDITIONAL_CONSUMPTION = 0.8;
    protected static final int PER_100_KM = 100;
    protected boolean isClimaTurnedOn;

    public Car(String name, double tankCapacity, double averageConsumption, boolean isClimaTurnedOn) {
        super(name, tankCapacity, averageConsumption);
        this.isClimaTurnedOn = isClimaTurnedOn;
    }

    public boolean isClimaTurnedOn() {
        return isClimaTurnedOn;
    }

    public double countRange() {
        if (isClimaTurnedOn) {
            return ((tankCapacity / (averageConsumption + AC_ADDITIONAL_CONSUMPTION) * PER_100_KM));
        } else {
            return (tankCapacity / averageConsumption) * PER_100_KM;
        }
    }

    protected void printInfo() {
        super.printInfo();
        System.out.print(" Zasieg ");
        System.out.printf("%.2f", countRange());
        System.out.println();
    }

    public void setClimaTurnedOn(boolean climaTurnedOn) {
        isClimaTurnedOn = climaTurnedOn;
    }
}
