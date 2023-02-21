package transport;

import java.util.List;

public class Car extends Transport<DriverCategoryB> {

    private TypeOfBoxes typeOfBoxes;


    public enum TypeOfBoxes {
        SEDAN("Седан"),
        HATCHBACK("Хетчбэк"),
        COUPE("Купе"),
        STATIONWAGON("Универсал"),
        ROADSTER("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private String box;

        TypeOfBoxes(String box) {
            this.box = box;
        }

        public String getBox() {
            return box;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + box;
        }
    }

    public Car(String brand, String model, double engineVolume, DriverCategoryB driver, List<Mechanic> mechanics, TypeOfBoxes typeOfBoxes) {
        super(brand, model, engineVolume, driver, mechanics);
        this.typeOfBoxes = typeOfBoxes;
    }

    public TypeOfBoxes getTypeOfBoxes() {
        return typeOfBoxes;
    }

    public void setTypeOfBoxes(TypeOfBoxes typeOfBoxes) {
        this.typeOfBoxes = typeOfBoxes;
    }

    @Override
    public void startMove() {
        System.out.println("Автомобиль марки " + getBrand() + " начал движение.");
    }

    @Override
    public void finishMove() {
        System.out.println("Автомобиль марки " + getBrand() + " закончил движение.");
    }

    @Override
    public Type getType() {
        return Type.CAR;
    }

    @Override
    public void printType() {
        if (typeOfBoxes == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else System.out.println(typeOfBoxes);
    }

    @Override
    public void passDiagnostic() {
        if (getType() == Type.CAR) {
            System.out.println("Автомобилю нужно пройти диагностику.");
        }

    }

    @Override
    public void pitstop() {
        System.out.println("Пит-стоп у автомобиля.");
    }

    @Override
    public void bestCircleTime() {
        int minTime = 10;
        int maxTime = 15;
        double bestTimeInMinutes = minTime + (maxTime - minTime) * Math.random();
        System.out.println("Лучшее время круга у автомобиля в минутах: " + bestTimeInMinutes);
    }

    @Override
    public void maxSpeed() {
        int minSpeed = 100;
        int maxSpeed = 170;
        double bestSpeed = minSpeed + (maxSpeed - minSpeed) * Math.random();
        System.out.println("Максимальная скорость у автомобиля: " + bestSpeed);
    }

    @Override
    public String toString() {
        return super.toString() + " " + typeOfBoxes;

    }
}

