package pl.javastart.task.test;

import pl.javastart.task.Car;
import pl.javastart.task.Truck;

public class Test {

    public static void main(String[] args) {

        Truck[] trucks = new Truck[3];
        trucks[0] = new Truck("Scania", 40, 10, false, 40);
        trucks[1] = new Truck("Man", 50, 15, false, 100);
        trucks[2] = new Truck("Volvo", 60, 12, false, 70);

        Car[] cars = new Car[3];
        cars[0] = new Car("Skoda", 30, 4, false);
        cars[1] = new Car("Opel", 25, 5, false);
        cars[2] = new Car("Kia", 20, 3, false);

        System.out.println("Samochody osobowe: ");
        for (Car car : cars) {
            car.printInfo();
            car.setClimaTurnedOn(true);
            car.printInfo();
            car.setClimaTurnedOn(false);
            car.printInfo();

        }
//        System.out.println("Samochody ciezarowe: ");
//        for (Truck truck : trucks) {
//            truck.printInfo();
//            truck.setClimaTurnedOn(true);
//            truck.printInfo();
//            truck.setClimaTurnedOn(false);
//            truck.printInfo();
    }
}
