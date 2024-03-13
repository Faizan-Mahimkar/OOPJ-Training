import java.util.Scanner;
public class addtwodigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
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
