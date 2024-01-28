package pl.javastart.task;

public class Test {

    public static void main(String[] args) {
//        Jezeli chce utworzyc obiekt najpierw, a potem przypisac go do tablicy, to dlaczego nie dziala ponizszy kod ?
//        Truck truck1 = new Truck("Scania", 40, 10, false, 40);
//        Truck[] trucks = new Truck[3];
//        trucks[0] = truck1;

        Truck[] trucks = new Truck[3];
        trucks[0] = new Truck("Scania", 40, 10, true, 40);
        trucks[1] = new Truck("Man", 50, 15, true, 100);
        trucks[2] = new Truck("Volvo", 60, 12, true, 70);

        Car[] cars = new Car[3];
        cars[0] = new Car("Skoda", 30, 4, false);
        cars[1] = new Car("Opel", 25, 5, false);
        cars[2] = new Car("Kia", 20, 3, false);

        System.out.println("Samochody ciezarowe");
        for (int i = 0; i < trucks.length; i++) {
            System.out.println("Nazwa " + trucks[i].getName() + " Pojemnosc baku " + trucks[i].getTankCapacity()
                    + " Srednie zuzycie " + trucks[i].getAverageConsumption() + " Dodatkowe obciazenie "
                    + trucks[i].getLoadWeight() + " Zasieg (km) " + trucks[i].countRange(trucks[i], false));
        }
        System.out.println();
        System.out.println("Samochody osobowe");
        for (int i = 0; i < trucks.length; i++) {
            System.out.println("Nazwa " + cars[i].getName() + " Pojemnosc baku " + cars[i].getTankCapacity()
                    + " Srednie zuzycie " + cars[i].getAverageConsumption() + " Zasieg (km) "
                    + cars[i].countRange(trucks[i], true));
        }

    }
}
