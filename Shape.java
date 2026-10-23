public class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }

    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}
