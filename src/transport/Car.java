package transport;

public class Car {

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String typeOfBody;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean typeOfTyres;
    private Key key;

    public static class Key {
        public final boolean remoteLaunch;
        public final boolean withoutKeyAcces;

        public Key(boolean remoteLaunch, boolean withoutKeyAcces) {
            this.remoteLaunch = remoteLaunch;
            this.withoutKeyAcces = withoutKeyAcces;
        }

        public boolean isRemoteLaunch() {
            return remoteLaunch;
        }

        public boolean isWithoutKeyAcces() {
            return withoutKeyAcces;
        }

        public String toString() {
            return (remoteLaunch?"Удаленный запуск двигателя":"Без удаленного запуска двигателя")
                    + ". " + (withoutKeyAcces?"Доступ без ключа":"Доступ без ключа отсутствует");

        }
    }

    public Car(
            String brand,
            String model,
            double engineVolume,
            String color,
            int year,
            String country,
            String transmission,
            String typeOfBody,
            String registrationNumber,
            int numberOfSeats,
            boolean typeOfTyres,
            Key key
    ) {

        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;

        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;

        setEngineVolume(engineVolume);

        setColor(color);

        if (year <= 0) {
            year = 2000;
        }
        this.year = year;

        if (country == null || country.isEmpty()) {
            country = "default";
        }
        this.country = country;

        setTransmission(transmission);

        if (typeOfBody == null || typeOfBody.isEmpty()) {
            typeOfBody = "Седан";
        }
        this.typeOfBody = typeOfBody;

        setRegistrationNumber(registrationNumber);

        if (numberOfSeats <= 0) {
            numberOfSeats = 5;
        }
        this.numberOfSeats = numberOfSeats;

        this.typeOfTyres = typeOfTyres;

        setKey(key);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            color = "белый";
        }
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            transmission = "Механическая КПП";
        }
        this.transmission = transmission;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            registrationNumber = "Автомобиль не зарегистрирован в ГИБДД";
        }
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isTypeOfTyres() {
        return typeOfTyres;
    }

    public void setTypeOfTyres(boolean typeOfTyres) {
        this.typeOfTyres = typeOfTyres;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if(key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    public void changeTyres(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            typeOfTyres = true;
        }
        if ((month >= 4 && month <= 10)) {
            typeOfTyres = false;
        }

    }

    @Override
    public String toString() {
        return "Марка: " + brand +
                ". Модель: " + model +
                ". Объем двигателя в литрах: " + engineVolume +
                ". Цвет кузова " + color +
                ". Год производства: " + year +
                ". Страна сборки: " + country +
                ". Коробка передач: " + transmission +
                ". Тип корпуса: " + typeOfBody +
                ". Регистрационный номер: " + registrationNumber +
                ". Количество мест: " + numberOfSeats + ". " +
                (typeOfTyres ? "Зимняя резина" : "Летняя резина") +
                ". " + key + ".";
    }
}

