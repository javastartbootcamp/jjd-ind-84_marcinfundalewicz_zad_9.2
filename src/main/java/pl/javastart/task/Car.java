package pl.javastart.task;

public class Car extends  Vehicle {
    protected static final double AC_ADDITIONAL_CONSUMPTION = 0.8;
    protected static final int PER_100_KM = 100;
    protected boolean isClimaTurnedOn;

    public Car(String name, double tankCapacity, double averageConsumption, boolean isClimaTurnedOn) {
        super(name, tankCapacity, averageConsumption);
        this.isClimaTurnedOn = isClimaTurnedOn;
    }

    double countRange() {
        return tankCapacity / currentConsumption() * PER_100_KM;
    }

    double currentConsumption() {
        if (isClimaTurnedOn) {
            return averageConsumption + AC_ADDITIONAL_CONSUMPTION;
        } else {
            return averageConsumption;
        }
    }

    public void printInfo() {
        super.printInfo();
        System.out.print(" Zasieg ");
        System.out.printf("%.2f", countRange());
        System.out.println();
    }

    public void setClimaTurnedOn(boolean climaTurnedOn) {
        isClimaTurnedOn = climaTurnedOn;
    }
}
