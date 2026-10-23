public class Area {
    // Circle
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Rectangle
    double area(double length, double width) {
        return length * width;
    }

    // Triangle (three sides, Heron's formula)
    double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Area ar = new Area();
        System.out.println("Circle area: " + ar.area(5.0));
        System.out.println("Rectangle area: " + ar.area(4.0, 6.0));
        System.out.println("Triangle area: " + ar.area(3.0, 4.0, 5.0));
    }
}
