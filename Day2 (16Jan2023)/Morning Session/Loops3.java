import java.util.*;
public class Loops3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        long product = calculateProductOfDigits(number);
        System.out.println("Multiplication of digits: " + product);
        scanner.close();
    }
    private static long calculateProductOfDigits(long number) {
        number = Math.abs(number);
        if (number == 0) {
            return 0;
        }
        long product = 1;
        while (number > 0) {
            product *= number % 10;
            number /= 10;
        }
        return product;
    }
}

