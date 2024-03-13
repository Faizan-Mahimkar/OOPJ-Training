import java.util.Scanner;
public class Series2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the number of terms in the series: ");
        int terms = scanner.nextInt();
        double sum = calculateExponentialSeries(x, terms);
        System.out.println("Sum of the series: " + sum);
        scanner.close();
    }
    private static double calculateExponentialSeries(double x, int terms) {
        double sum = 1.0;
        for (int n = 1; n < terms; n++) {
            double term = Math.pow(x, n) / factorial(n);
            sum += term;
        }
        return sum;
    }
    private static double factorial(int n) {
        if (n == 0 || n == 1) {
            return 1.0;
        }
        double result = 1.0;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
