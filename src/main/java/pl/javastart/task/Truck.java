package pl.javastart.task;

public class Truck extends Car {
    private double loadWeight;

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    public Truck(String name, double tankCapacity, double averageConsumption, boolean isClimaTurnedOn, double loadWeight) {
        super(name, tankCapacity, averageConsumption, isClimaTurnedOn);
        this.loadWeight = loadWeight;
    }

    public double countRange(Vehicle vehicle, boolean isClimaTurnedOn, double loadWeight) {
        if (isClimaTurnedOn) {
            return ((vehicle.getTankCapacity() / (vehicle.getAverageConsumption() + 1.6 + 0.005 * loadWeight) * 100));
        } else {
            return (vehicle.getTankCapacity() / (vehicle.getAverageConsumption() + 0.05 * loadWeight) * 100);
        }
    }
}
