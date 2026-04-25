package sater;

public class Car extends Vehicle {
    private int seats;

    public Car(String model, String country, int year, int seats) {
        super(model, country, year);
        this.seats = seats;
        }

    @Override
    public String getInfo() {
        return "Car: " + super.getInfo() + ", Seats: " + seats;
    }
}
