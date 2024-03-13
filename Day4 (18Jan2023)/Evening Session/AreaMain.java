import java.util.Scanner;
class Rectangle {
    private double length;
    private double width;
    public Rectangle() {
    }
    public void setDimensions(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
}
public class AreaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle();
        rectangle.setDimensions(length, width);
        double area = rectangle.calculateArea();
        System.out.println("Area of the rectangle: " + area);
        scanner.close();
    }
}
