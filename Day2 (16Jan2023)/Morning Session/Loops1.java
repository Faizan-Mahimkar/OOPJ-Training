import java.util.*;
public class Loops1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);
        scanner.close();
    }
    private static int countDigits(long number) {
        number = Math.abs(number);
        if (number == 0) {
            return 1; 
        }
        int count = 0;
        while (number > 0) {
            number /= 10; 
            count++;      
        }
        return count;
    }
}
