public class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    public double findArea() {
        return length * width;
    }

    public double findPerimeter() {
        return 2 * (length + width);
    }
}