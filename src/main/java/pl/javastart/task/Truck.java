package pl.javastart.task;

public class Truck extends Car {
    public static final double AC_ADDITIONAL_CONSUMPTION = 1.6;
    public static final double LOAD_ADDITIONAL_CONSUMPTION = 0.005;
    protected double loadWeight;

    public Truck(String name, double tankCapacity, double averageConsumption, boolean isClimaTurnedOn, double loadWeight) {
        super(name, tankCapacity, averageConsumption, isClimaTurnedOn);
        this.loadWeight = loadWeight;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    public double countRange() {
        if (isClimaTurnedOn) {
            return ((tankCapacity / (averageConsumption + AC_ADDITIONAL_CONSUMPTION + LOAD_ADDITIONAL_CONSUMPTION * loadWeight) * PER_100_KM));
        } else {
            return ((tankCapacity / (averageConsumption + LOAD_ADDITIONAL_CONSUMPTION * loadWeight) * PER_100_KM));
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
}
