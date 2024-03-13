import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " is a century leap year.");
            }
            else {
                System.out.println(year + " is a non century leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }
        scanner.close();
    }
}
