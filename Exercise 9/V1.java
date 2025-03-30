interface Vehicle {
    void startEngine();
    void stopEngine();
}

class Car implements Vehicle {
    public void startEngine() {
        System.out.println("Car engine started.");
    }
    
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

class Bicycle implements Vehicle {
    public void startEngine() {
        System.out.println("Bicycles do not have an engine.");
    }
    
    public void stopEngine() {
        System.out.println("Bicycles do not have an engine to stop.");
    }
}

public class V1 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();
        
        car.startEngine();
        car.stopEngine();
        
        bicycle.startEngine();
        bicycle.stopEngine();
    }
}
