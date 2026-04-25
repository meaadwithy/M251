package sater;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String model, String country, int year, double loadCapacity) {
        super(model,country,year);
        this.loadCapacity = loadCapacity;
    }
    @Override
    public String getInfo(){
        return "Truck: " + super.getInfo() + "loadCapacity" + loadCapacity;
    }
}
