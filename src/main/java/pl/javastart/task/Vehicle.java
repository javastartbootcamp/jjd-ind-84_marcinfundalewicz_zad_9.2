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

    public void printInfo() {
        System.out.print("Nazwa " + name + " Pojemnosc baku " + tankCapacity
                + " Srednie zuzycie " + averageConsumption);
    }
}

