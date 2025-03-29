class Shape {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return 0.0;
    }

    public void displayArea(double area) {
        System.out.println("Area: " + area);
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Shape shape = new Shape();
        double circleArea = shape.calculateArea(7.0);
        double rectangleArea = shape.calculateArea(5.0, 10.0);
        double triangleArea = shape.calculateArea(6.0, 8.0, true);
        shape.displayArea(circleArea);
        shape.displayArea(rectangleArea);
        shape.displayArea(triangleArea);
    }
}