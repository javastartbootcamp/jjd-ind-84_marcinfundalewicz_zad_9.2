package pl.javastart.task;

public class Vehicle {
    protected String name;
    protected double tankCapacity;
    protected double averageConsumption;

    public Vehicle(String name, double tankCapacity, double averageConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.averageConsumption = averageConsumption;
    }

    protected void printInfo() {
        System.out.print("Nazwa " + name + " Pojemnosc baku " + tankCapacity
                + " Srednie zuzycie " + averageConsumption);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getAverageConsumption() {
        return averageConsumption;
    }

    public void setAverageConsumption(double averageConsumption) {
        this.averageConsumption = averageConsumption;
    }
}
