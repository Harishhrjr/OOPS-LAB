abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
   
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double width, height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    
    double area() {
        return width * height;
    }
}

public class area {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Area: " + rectangle.area());
    }
}
