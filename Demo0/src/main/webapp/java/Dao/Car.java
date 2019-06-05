package Dao;

public class Car {
    private  String name;
    private  String price;
    public Car(String name,String price)
    {
        this.name=name;
        this.price=price;
    }

    public String GetPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return "name="+this.name+" price="+this.price;
    }
}
