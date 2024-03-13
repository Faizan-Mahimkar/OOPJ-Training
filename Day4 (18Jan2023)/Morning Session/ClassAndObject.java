import java.util.Scanner;
class Calculator {
    public long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }
    public double squareRoot(double number) {
        return Math.sqrt(number);
    }
}
public class ClassAndObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        Calculator calculator = new Calculator();
        int choice;
        do {
        System.out.println("Select an operation:");
        System.out.println("1. Factorial");
        System.out.println("2. Power");
        System.out.println("3. Square Root");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();        
        switch (choice) {
            case 1:
                int n = (int) number; 
                long factorialResult = calculator.factorial(n);
                System.out.println("Factorial of " + n + " is: " + factorialResult);
                break;
            case 2:
                System.out.print("Enter the exponent for power calculation: ");
                int exponent = scanner.nextInt();
                double powerResult = calculator.power(number, exponent);
                System.out.println(number + " raised to the power of " + exponent + " is: " + powerResult);
                break;
            case 3:
                if (number >= 0) {
                    double squareRootResult = calculator.squareRoot(number);
                    System.out.println("Square root of " + number + " is: " + squareRootResult);
                } else {
                    System.out.println("Cannot calculate square root for a negative number.");
                }
                break;
            case 4:
                System.out.println("Exiting the program. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
            }
        }while(choice != 4);
        scanner.close();
    }
}
