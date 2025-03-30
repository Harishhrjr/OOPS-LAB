abstract class Vehicle {
    String make, model;
    
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
    
    abstract void startEngine();
}

class Car extends Vehicle {
    public Car(String make, String model) {
        super(make, model);
    }
    
  
    void startEngine() {
        System.out.println(make + " " + model + "'s engine started.");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model) {
        super(make, model);
    }
    

    void startEngine() {
        System.out.println(make + " " + model + "'s engine started.");
    }
}

public class veh {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camero");
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Sportster");
        
        car.startEngine();
        motorcycle.startEngine();
    }
}
