package transport;

public class Mechanic {

    private String foolName;
    private String company;

    public Mechanic(String foolName, String company) {
        this.foolName = foolName;
        this.company = company;
    }

    public String getFoolName() {
        return foolName;
    }

    public void setFoolName(String foolName) {
        this.foolName = foolName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void performMaintenance () {
        System.out.println("Проведение техобслуживания.");
    }

    public void repairTheCar () {
        System.out.println("Ремонт машины.");
    }

    @Override
    public String toString() {
        return "Механик " + foolName + ". Компания " + company;
    }
}

