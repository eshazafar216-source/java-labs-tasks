class Calculator {
    int add(int a, int b) { return a + b; }
    int subtract(int a, int b) { return a - b; }
    int multiply(int a, int b) { return a * b; }
    double divide(double a, double b) { return a / b; }
}

public class ScientificCalculator extends Calculator {
    double square(double a) { return a * a; }
    double power(double a, double b) { return Math.pow(a, b); }
    double squareRoot(double a) { return Math.sqrt(a); }

    public static void main(String[] args) {
        ScientificCalculator sc = new ScientificCalculator();

        System.out.println("Add: " + sc.add(5, 10));
        System.out.println("Subtract: " + sc.subtract(10, 5));
        System.out.println("Multiply: " + sc.multiply(5, 10));
        System.out.println("Divide: " + sc.divide(10, 4));
        System.out.println("Square: " + sc.square(5));
        System.out.println("Power: " + sc.power(5, 10));
        System.out.println("Square Root: " + sc.squareRoot(25));
    }
}
