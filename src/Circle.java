public class Circle extends Shape {

    private int radius;

    public Circle(int r) {
        radius = r;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }

    public double findPerimeter() {
        return 2 * Math.PI * radius;
    }
}