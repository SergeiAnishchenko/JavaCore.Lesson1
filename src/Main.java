import transport.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<Mechanic> mechanics = new ArrayList<>();
        Mechanic mechanic1 = new Mechanic("Иван Игнатьев", "Автосервис№1");
        Mechanic mechanic2 = new Mechanic("Артем Иванов", "Автосервис№2");
        Mechanic mechanic3 = new Mechanic("Олег Соколов", "Автосервис№3");
        mechanics.add(mechanic1);
        mechanics.add(mechanic2);
        mechanics.add(mechanic3);


        for (int i = 1; i <= 4; i++) {
            DriverCategoryB driverCategoryB = new DriverCategoryB("Водитель категории B №" + i, true, 3 + i);
            Car.TypeOfBoxes typesOfBoxes = Car.TypeOfBoxes.SEDAN;
            Car car = new Car(
                    "Car brand №" + i,
                    "Car model №" + i,
                    1.6,
                    driverCategoryB,
                    mechanics,
                    typesOfBoxes
            );
            DriverCategoryC driverCategoryC = new DriverCategoryC("Водитель категории С №" + i, true, 5 + i);
            Truck.LoadCapacity loadCapacity = Truck.LoadCapacity.N3;
            Truck truck = new Truck(
                    "Truck brand №" + i,
                    "Truck model №" + i,
                    4.5,
                    driverCategoryC,
                    mechanics,
                    loadCapacity
            );
            DriverCategoryD driverCategoryD = new DriverCategoryD("Водитель категории D №" + i, true, 7 + i);
            Bus.Capacity capacity = Bus.Capacity.MIDDLE;
            Bus bus = new Bus(
                    "Bus brand №" + i,
                    "Bus model №" + i,
                    4.0,
                    driverCategoryD,
                    mechanics,
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
                mechanics,
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
                mechanics,
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
                mechanics,
                Bus.Capacity.BIG);
        System.out.println(newBus.getType());
        newBus.printType();
        newBus.passDiagnostic();

        System.out.println();

        System.out.println(newBus.getMechanics());

        System.out.println();

        List<Transport> transportList = new ArrayList<>();
        transportList.add(newCar);
        transportList.add(newTruck);
        transportList.add(newBus);
        for (Transport transport : transportList) {
            System.out.println("Водитель " + transport.getDriver().getName() + ". " + transport.getMechanics().get(1));
        }

        System.out.println();

        ServiceStation serviceStation = new ServiceStation();
        Queue<Transport> queueOfCars = new LinkedList<>();
        serviceStation.addToQueue(newCar);
        serviceStation.addToQueue(newTruck);
        serviceStation.addToQueue(newBus);
        System.out.println();
        serviceStation.conductOfTechnicalInspection();
        System.out.println();

    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand());

    }
}
