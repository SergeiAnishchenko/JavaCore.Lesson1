package transport;

import java.util.List;

public class Truck extends Transport<DriverCategoryC> {

    private LoadCapacity loadCapacity;

    public enum LoadCapacity {
        N1(null, 3.5F),
        N2(3.6F, 12F),
        N3(12F, null);


        private Float minLoadСapacity;
        private Float maxLoadСapacity;

        LoadCapacity(Float minLoadСapacity, Float maxLoadСapacity) {
            this.minLoadСapacity = minLoadСapacity;
            this.maxLoadСapacity = maxLoadСapacity;
        }

        public float getMinLoadСapacity() {
            return minLoadСapacity;
        }

        public float getMaxLoadСapacity() {
            return maxLoadСapacity;
        }

        @Override
        public String toString() {
            String loadCapacity = null;
            if (minLoadСapacity == null) {
                loadCapacity = "Грузоподъемность: до " + maxLoadСapacity + " тонн.";
            }
            if (maxLoadСapacity == null) {
                loadCapacity = "Грузоподъемность: от " + minLoadСapacity + " тонн.";
            }
            if (minLoadСapacity != null && maxLoadСapacity != null) {
                loadCapacity = "Грузоподъемность: от " + minLoadСapacity + " до " + maxLoadСapacity + " тонн.";
            }

            return loadCapacity;
        }

        ;
    }

    public Truck(String brand, String model, double engineVolume, DriverCategoryC driver, List<Mechanic> mechanics, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, driver, mechanics);
        this.loadCapacity = loadCapacity;
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
    public Type getType() {
        return Type.TRUCK;
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else System.out.println(loadCapacity);
    }

    @Override
    public void passDiagnostic() {
        if (getType() == Type.TRUCK) {
            System.out.println("Грузовику нужно пройти диагностику.");
        }
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

    @Override
    public String toString() {
        return super.toString() + " " + loadCapacity;
    }
}
