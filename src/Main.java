import transport.*;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            DriverCategoryB driverCategoryB = new DriverCategoryB("Водитель категории B №" + i, true, 3 + i);
            Car car = new Car(
                    "Car brand №" + i,
                    "Car model №" + i,
                    1.6,
                    driverCategoryB
            );
            DriverCategoryC driverCategoryC = new DriverCategoryC("Водитель категории С №" + i, true, 5 + i);
            Truck truck = new Truck(
                    "Truck brand №" + i,
                    "Truck model №" + i,
                    4.5,
                    driverCategoryC
            );
            DriverCategoryD driverCategoryD = new DriverCategoryD("Водитель категории D №" + i, true, 7 + i);
            Bus bus = new Bus(
                    "Bus brand №" + i,
                    "Bus model №" + i,
                    4.0,
                    driverCategoryD
            );
            printInfo(car);
            printInfo(bus);
            printInfo(truck);
        }
    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand());

    }
}
