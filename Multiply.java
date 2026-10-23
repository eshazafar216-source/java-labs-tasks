public class Multiply {
    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        Multiply m = new Multiply();
        System.out.println(m.multiply(2, 3));
        System.out.println(m.multiply(2, 3, 4));
    }
}
