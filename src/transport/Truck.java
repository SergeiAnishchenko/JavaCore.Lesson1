package transport;

public class Truck extends Transport<DriverCategoryC> {


    public Truck(String brand, String model, double engineVolume, DriverCategoryC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик марки " + getBrand() + " начал движение.");
    }

    @Override
    public void finishMove() {
        System.out.println("Грузовик марки " + getBrand() + " закончил движение.");
    }

    @Override
    public void pitstop() {
        System.out.println("Пит-стоп у грузовика.");
    }

    @Override
    public void bestCircleTime() {
        int minTime = 40;
        int maxTime = 65;
        double bestTimeInMinutes = minTime + (maxTime - minTime) * Math.random();
        System.out.println("Лучшее время круга у грузовика в минутах: " + bestTimeInMinutes);
    }

    @Override
    public void maxSpeed() {
        int minSpeed = 110;
        int maxSpeed = 140;
        double bestSpeed = minSpeed + (maxSpeed - minSpeed) * Math.random();
        System.out.println("Максимальная скорость у грузовика: " + bestSpeed);
    }
}
