
class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}


class Car extends Vehicle {
    int numDoors;

    Car(String brand, int speed, int numDoors) {
        super(brand, speed);
        this.numDoors = numDoors;
    }

    void showCarDetails() {
        showDetails();
        System.out.println("Number of doors: " + numDoors);
    }
}


public class VehicleI {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 180, 4);
        car.showCarDetails();
    }
}
