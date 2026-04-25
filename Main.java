package sater;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car = new Car("Toyota", "Japan",2022, 5);
        Bike bike = new Bike("Yamaha", "Japan",2021,  600);
        Truck truck = new Truck("Volvo", "Sweden",2020,  18);


        garage.addV(car);
        garage.addV(bike);
        garage.addV(truck);

        garage.printAll();
    }
}
