import java.util.Scanner;
public class MultiplyWithoutOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int result = multiplyWithoutOperator(num1, num2);
        System.out.println("Product: " + result);
        scanner.close();
    }
    private static int multiplyWithoutOperator(int num1, int num2) {
        int result = 0;
        if (num2 < 0) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        for (int i = 0; i < Math.abs(num2); i++) {
            result += num1;
        }
        if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
            result = -result;
        }
        return result;
    }
}
