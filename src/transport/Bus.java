package transport;

import java.util.List;

public class Bus extends Transport<DriverCategoryD> {

    private Capacity capacity;

    public enum Capacity {
        ESPECIALLYSMALL(0, 10),
        SMALL(11, 25),
        MIDDLE(26, 50),
        BIG(51, 80),
        ESPECIALLYBIG(81, 120);


        private Integer minСapacity;
        private Integer maxСapacity;

        Capacity(Integer minСapacity, Integer maxСapacity) {
            this.minСapacity = minСapacity;
            this.maxСapacity = maxСapacity;
        }

        public Integer getMinСapacity() {
            return minСapacity;
        }

        public Integer getMaxСapacity() {
            return maxСapacity;
        }

        @Override
        public String toString() {
            String capacity = null;
            if (minСapacity == null) {
                capacity = "Вместимость: до " + maxСapacity + " мест.";
            }
            if (maxСapacity == null) {
                capacity = "Вместимость: от " + minСapacity + " мест.";
            }
            if (minСapacity != null && maxСapacity != null) {
                capacity = "Вместимость: от " + minСapacity + " до " + maxСapacity + " мест.";
            }

            return capacity;
        }

        ;
    }


    public Bus(String brand, String model, double engineVolume, DriverCategoryD driver, List<Mechanic> mechanics, Capacity capacity) {
        super(brand, model, engineVolume, driver, mechanics);
        this.capacity = capacity;
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
    public Type getType() {
        return Type.BUS;
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else System.out.println(capacity);
    }

    @Override
    public void passDiagnostic() {
        if (getType() == Type.BUS) {
            try {
                throw new TransportTypeException("Автобусам проходить диагностику не нужно.");
            } catch (TransportTypeException e) {
                System.err.println(e.getMessage());
            }
        }

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

    @Override
    public String toString() {
        return super.toString() + " " + capacity;
    }
}
