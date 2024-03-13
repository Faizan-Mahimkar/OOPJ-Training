import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day:");
        String day = scanner.next();
        day = day.toLowerCase();
        if (day.equals("saturday") || day.equals("sunday")) {
            System.out.println(day + " is a weekend day.");
        } else if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") ||
                   day.equals("thursday") || day.equals("friday")) {
            System.out.println(day + " is a working day.");
        } else {
            System.out.println("Invalid input. Please enter a valid day.");
        }
        scanner.close();
    }
}
