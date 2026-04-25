package sater;
import java.util.ArrayList;
public class Vehicle {
    protected String model;
    protected String country;
    protected int year;

    public Vehicle(String model, String country, int year) {
        this.model = model;
        this.country = country;
        this.year = year;
    }

    public String getInfo() {
        return "Model: " + model + ", Year: " + year + ", Country: " + country;
    }

}
