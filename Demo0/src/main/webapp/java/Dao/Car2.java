package Dao;

public class Car2 {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    private  String name;
    private  String price;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    private Car car;

    @Override
    public String toString() {
        return "name="+this.name+" price="+this.price+" "+car;
    }
}
