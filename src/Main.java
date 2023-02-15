import transport.*;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            DriverCategoryB driverCategoryB = new DriverCategoryB("Водитель категории B №" + i, true, 3 + i);
            Car.TypeOfBoxes typesOfBoxes = Car.TypeOfBoxes.SEDAN;
            Car car = new Car(
                    "Car brand №" + i,
                    "Car model №" + i,
                    1.6,
                    driverCategoryB,
                    typesOfBoxes
            );
            DriverCategoryC driverCategoryC = new DriverCategoryC("Водитель категории С №" + i, true, 5 + i);
            Truck.LoadCapacity loadCapacity = Truck.LoadCapacity.N3;
            Truck truck = new Truck(
                    "Truck brand №" + i,
                    "Truck model №" + i,
                    4.5,
                    driverCategoryC,
                    loadCapacity
            );
            DriverCategoryD driverCategoryD = new DriverCategoryD("Водитель категории D №" + i, true, 7 + i);
            Bus.Capacity capacity = Bus.Capacity.MIDDLE;
            Bus bus = new Bus(
                    "Bus brand №" + i,
                    "Bus model №" + i,
                    4.0,
                    driverCategoryD,
                    capacity
            );
            System.out.println(car);
            System.out.println(truck);
            System.out.println(bus);

            printInfo(car);
            printInfo(bus);
            printInfo(truck);

        }

        System.out.println();

        Car newCar = new Car(
                "Жигули",
                "Копейка",
                1.2,
                new DriverCategoryB("Валерий", true, 35),
                Car.TypeOfBoxes.SEDAN);
        System.out.println(newCar.getType());
        newCar.printType();
        newCar.passDiagnostic();

        System.out.println();

        Truck newTruck = new Truck(
                "БелАЗ",
                "БелАЗ-75320",
                130.0,
                new DriverCategoryC("Олег", true, 15),
                Truck.LoadCapacity.N3);
        System.out.println(newTruck.getType());
        newTruck.printType();
        newTruck.passDiagnostic();

        System.out.println();

        Bus newBus = new Bus(
                "ПАЗ",
                "ПАЗ 3204",
                4.43,
                new DriverCategoryD("Андрей", true, 17),
                Bus.Capacity.BIG);
        System.out.println(newBus.getType());
        newBus.printType();
        newBus.passDiagnostic();
    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand());

    }
}
