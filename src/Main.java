import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car(
                "Lada",
                "Lada Granta",
                1.7,
                "жёлтый",
                2015,
                "Россия",
                150,
                "Механическая КПП",
                null,
                null,
                0,
                true,
                null
        );

        System.out.println(lada);


        Car audi = new Car(
                "Audi",
                "Audi A8 50 L TDI quattro",
                3.0,
                "чёрный",
                2020,
                " Германия",
                220,
                "Автоматическая КПП",
                "Седан",
                "М245КВ 178",
                0,
                false,
                new Car.Key(false, false)
        );

        System.out.println(audi);


        Car bmw = new Car(
                "BMW",
                "BMW Z8",
                3.0,
                "чёрный",
                2021,
                "Германия",
                235,
                "Автматическая КПП",
                null,
                "А322ВА 97",
                0,
                true,
                new Car.Key(true, true)

        );

        System.out.println(bmw);


        Car kia = new Car(
                "Kia",
                "Kia Sportage 4-го поколения",
                2.4,
                "красный",
                2018,
                "Южная Корея",
                180,
                "Механическая КПП",
                null,
                null,
                0,
                false,
                new Car.Key(true, false)
        );

        System.out.println(kia);


        Car hyundai = new Car(
                "Hyundai",
                "Hyundai Avante",
                1.6,
                "оранжевый",
                2016,
                "Южная Корея",
                190,
                "Механическая КПП",
                null,
                "К022ВА 98",
                0,
                true,
                new Car.Key(true, false)
        );

        System.out.println(hyundai);

        hyundai.changeTyres(8);
        System.out.println(hyundai);

        for (int i = 1; i <= 3; i++) {
            Bus bus = new Bus(
                    "Bus brand №" + i,
                    "Bus model №" + i,
                    2015 + i,
                    "Россия",
                    "Белый",
                    90 + 10 * i
            );
            System.out.println(bus);
        }

    }
}
