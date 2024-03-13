import java.util.Scanner;
class Triangle1 {
    private double side1;
    private double side2;
    private double side3;
    public Triangle1() {
    }
    public void setSides(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the length of side 3: ");
        double side3 = scanner.nextDouble();
        Triangle1 triangle = new Triangle1();
        triangle.setSides(side1, side2, side3);
        double area = triangle.calculateArea();
        System.out.println("Area of the triangle: " + area);
        double perimeter = triangle.calculatePerimeter();
        System.out.println("Perimeter of the triangle: " + perimeter);
        scanner.close();
    }
}
