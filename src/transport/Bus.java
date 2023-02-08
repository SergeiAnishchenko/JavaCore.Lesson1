package transport;

public class Bus extends Transport<DriverCategoryD> {


    public Bus(String brand, String model, double engineVolume, DriverCategoryD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Автобус марки " + getBrand() + " начал движение.");
    }

    @Override
    public void finishMove() {
        System.out.println("Автобус марки " + getBrand() + " закончил движение.");
    }

    @Override
    public void pitstop() {
        System.out.println("Пит-стоп у автобуса.");
    }

    @Override
    public void bestCircleTime() {
        int minTime = 50;
        int maxTime = 75;
        double bestTimeInMinutes = minTime + (maxTime - minTime) * Math.random();
        System.out.println("Лучшее время круга у автобуса в минутах: " + bestTimeInMinutes);
    }

    @Override
    public void maxSpeed() {
        int minSpeed = 80;
        int maxSpeed = 100;
        double bestSpeed = minSpeed + (maxSpeed - minSpeed) * Math.random();
        System.out.println("Максимальная скорость у автобуса: " + bestSpeed);
    }
}
