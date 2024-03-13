import java.util.*;
public class Loops2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        int sum = calculateSumOfDigits(number);
        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
    private static int calculateSumOfDigits(long number) {
        number = Math.abs(number);
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}

