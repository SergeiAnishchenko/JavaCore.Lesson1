public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println(" ");
        task2();
        System.out.println(" ");
        task3();
    }

    private static void task1() {
        System.out.println("Задача 1");

        Car lada = new Car();
        lada.brand = "Lada";
        lada.model = "Lada Granta";
        lada.engineVolume = 1.7;
        lada.color = "жёлтый";
        lada.year = 2015;
        lada.country = "Россия";
        System.out.println(lada);


        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "Audi A8 50 L TDI quattro";
        audi.engineVolume = 3.0;
        audi.color = "чёрный";
        audi.year = 2020;
        audi.country = "Германия";
        System.out.println(audi);


        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "BMW Z8";
        bmw.engineVolume = 3.0;
        bmw.color = "чёрный";
        bmw.year = 2021;
        bmw.country = "Германия";
        System.out.println(bmw);


        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Kia Sportage 4-го поколения";
        kia.engineVolume = 2.4;
        kia.color = "красный";
        kia.year = 2018;
        kia.country = "Южная Корея";
        System.out.println(kia);


        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Hyundai Avante";
        hyundai.engineVolume = 1.6;
        hyundai.color = "оранжевый";
        hyundai.year = 2016;
        hyundai.country = "Южная Корея";
        System.out.println(hyundai);
    }

    private static void task2() {
        System.out.println("Задача 2");

        Car lada = new Car(
                "Lada",
                "Lada Granta",
                1.7,
                "жёлтый",
                2015,
                "Россия");

        System.out.println(lada);


        Car audi = new Car(
                "Audi",
                "Audi A8 50 L TDI quattro",
                3.0,
                "чёрный",
                2020,
                " Германия");

        System.out.println(audi);


        Car bmw = new Car(
                "BMW",
                "BMW Z8",
                3.0,
                "чёрный",
                2021,
                "Германия");

        System.out.println(bmw);


        Car kia = new Car(
                "Kia",
                "Kia Sportage 4-го поколения",
                2.4,
                "красный",
                2018,
                "Южная Корея");

        System.out.println(kia);


        Car hyundai = new Car(
                "Hyundai",
                "Hyundai Avante",
                1.6,
                "оранжевый",
                2016,
                "Южная Корея");

        System.out.println(hyundai);

    }

    private static void task3() {
        System.out.println("Задача 3");

        Car lada = new Car(
                null,
                "Lada Granta",
                1.7,
                "жёлтый",
                2015,
                "Россия");

        System.out.println(lada);


        Car audi = new Car(
                "Audi",
                "",
                3.0,
                "чёрный",
                2020,
                " Германия");

        System.out.println(audi);


        Car bmw = new Car(
                "BMW",
                "BMW Z8",
                -3.0,
                "чёрный",
                2021,
                "Германия");

        System.out.println(bmw);


        Car kia = new Car(
                "Kia",
                "Kia Sportage 4-го поколения",
                0,
                null,
                2018,
                "");

        System.out.println(kia);


        Car hyundai = new Car(
                "Hyundai",
                "Hyundai Avante",
                1.6,
                "оранжевый",
                0,
                "Южная Корея");

        System.out.println(hyundai);

    }

}