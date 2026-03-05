import java.util.Scanner;

class Area {
    double length;
    double breadth;

    // Method to set dimensions
    void setDim(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to calculate and return area
    double getArea() {
        return length * breadth;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Area rect = new Area();

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        rect.setDim(l, b);

        System.out.println("Area of rectangle = " + rect.getArea());

        sc.close();
    }
}