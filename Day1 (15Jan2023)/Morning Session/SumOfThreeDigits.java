import java.util.*;
public class SumOfThreeDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();
        if (number < 100 || number > 999) {
            System.out.println("Please enter a valid three-digit number.");
            scanner.close();
            return;
        }
        int sum = 0;
        int tempNumber = Math.abs(number); 
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            sum += digit;
            tempNumber /= 10;
        }
        System.out.println("The sum of digits of the number is: " + sum);
        scanner.close();
    }
}
