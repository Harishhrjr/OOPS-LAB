interface Vehicle {
    void displayDetails();
}

class Car implements Vehicle {
    protected String brand;
    protected String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

  
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Bike implements Vehicle {
    protected String brand;
    protected String type;

    public Bike(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }


    public void displayDetails() {
        System.out.println("Bike Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
    }
}

class ElectricCar extends Car {
    private double batteryCapacity;

    public ElectricCar(String brand, String model, double batteryCapacity) {
        super(brand, model);
        this.batteryCapacity = batteryCapacity;
    }


    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");
        Bike bike = new Bike("Yamaha", "Sport");
        ElectricCar electricCar = new ElectricCar("Tesla", "Model 3", 75.0);
        car.displayDetails();
        System.out.println();
        bike.displayDetails();
        System.out.println();
        electricCar.displayDetails();
    }
}
