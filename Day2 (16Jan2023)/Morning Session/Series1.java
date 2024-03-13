import java.util.Scanner;
public class Series1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the number of terms in the series: ");
        int terms = scanner.nextInt();
        double sum = calculateSeriesSum(x, terms);
        System.out.println("Sum of the series: " + sum);

        scanner.close();
    }
    private static double calculateSeriesSum(double x, int terms) {
        double sum = 1.0; 
        for (int i = 1; i < terms; i++) {
            sum += Math.pow(x, i) / i;
        }
        return sum;
    }
}
