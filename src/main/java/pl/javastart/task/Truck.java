package pl.javastart.task;

public class Truck extends Car {
    protected static final double AC_ADDITIONAL_CONSUMPTION = 1.6;
    protected static final double LOAD_ADDITIONAL_CONSUMPTION = 0.005;
    protected double loadWeight;

    public Truck(String name, double tankCapacity, double averageConsumption, boolean isClimaTurnedOn, double loadWeight) {
        super(name, tankCapacity, averageConsumption, isClimaTurnedOn);
        this.loadWeight = loadWeight;
    }

    @Override
    public double currentConsumption() {
        if (isClimaTurnedOn) {
            return averageConsumption + AC_ADDITIONAL_CONSUMPTION +  LOAD_ADDITIONAL_CONSUMPTION * loadWeight;
        } else {
            return averageConsumption +  LOAD_ADDITIONAL_CONSUMPTION * loadWeight;
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
}
