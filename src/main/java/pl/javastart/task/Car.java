package pl.javastart.task;

public class Car extends  Vehicle {
    private boolean isClimaTurnedOn;

    public Car(String name, double tankCapacity, double averageConsumption, boolean isClimaTurnedOn) {
        super(name, tankCapacity, averageConsumption);
        this.isClimaTurnedOn = isClimaTurnedOn;
    }

    public double countRange(Vehicle vehicle, boolean isClimaTurnedOn) {
        if (isClimaTurnedOn) {
            return ((vehicle.getTankCapacity() / (vehicle.getAverageConsumption() + 0.8) * 100));
        } else {
            return (vehicle.getTankCapacity() / vehicle.getAverageConsumption()) * 100;
        }
    }
}
