package org.example.carfactory;

public class CarFactory {
    String brand;

    public CarFactory(String brand) {
        this.brand = brand;
    }

    public Car createNewCar(String color) {
        return new Car(color, this.brand);
    }
}
