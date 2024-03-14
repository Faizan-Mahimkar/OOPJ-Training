import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] emails = new String[5];
        System.out.println("Enter 5 email IDs:");
        for (int i = 0; i < 5; i++) {
            emails[i] = sc.next();
        }
        System.out.println("Email IDs with initial name 'raj':");
        boolean found = false;
        for (String email : emails) {
            if (email.startsWith("raj")) {
                System.out.println(email);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No email IDs found with initial name 'raj'.");
        }
        sc.close();
    }
}
