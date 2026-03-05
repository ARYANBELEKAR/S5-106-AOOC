// SHAPE INTERFACE
interface Shape {
    double area();   // abstract method
}

// RECTANGLE CLASS
class Rectangle implements Shape {

    double length;
    double width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }
}

// TRIANGLE CLASS
class Triangle implements Shape {

    double base;
    double height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    public double area() {
        return 0.5 * base * height;
    }
}

// TEST CLASS
public class ShapeTest {
    public static void main(String[] args) {

        Shape r = new Rectangle(10, 5);
        Shape t = new Triangle(6, 4);

        System.out.println("Area of Rectangle: " + r.area());
        System.out.println("Area of Triangle: " + t.area());
    }
}