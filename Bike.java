package sater;

public class Bike extends Vehicle{
    private int engineCapacity;

    public Bike(String model, String country, int year, int engineCapacity){
        super(model, country, year);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String getInfo(){
        return "Bice: " + super.getInfo() + "engineCapacity: " + engineCapacity;
    }
}
