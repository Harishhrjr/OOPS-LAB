class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public void displayResult(int result) {
        System.out.println("Result: " + result);
    }

    public void displayResult(double result) {
        System.out.println("Result: " + result);
    }
}

public class Calculator12 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum1 = calculator.add(5, 10);
        int sum2 = calculator.add(3, 6, 9);
        double sum3 = calculator.add(4.5, 2.3);
        calculator.displayResult(sum1);
        calculator.displayResult(sum2);
        calculator.displayResult(sum3);
    }
}