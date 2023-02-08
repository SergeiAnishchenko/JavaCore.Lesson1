package transport;

public class Car extends Transport<DriverCategoryB> {


    public Car(String brand, String model, double engineVolume, DriverCategoryB driver) {
        super(brand, model, engineVolume, driver);
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
}

