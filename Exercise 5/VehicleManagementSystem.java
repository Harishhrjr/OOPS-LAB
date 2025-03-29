class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Vehicle Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    protected int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class ElectricCar extends Car {
    private double batteryCapacity;

    public ElectricCar(String brand, String model, int year, int numberOfDoors, double batteryCapacity) {
        super(brand, model, year, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
    }

    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 2022, 4, 100.0);
        electricCar.displayInfo();
    }
}
