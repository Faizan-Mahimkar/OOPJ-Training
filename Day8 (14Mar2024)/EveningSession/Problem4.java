import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        String[] usernames = new String[10];
        String[] passwords = new String[10];
        initializeData(usernames, passwords);
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new username: ");
        String newUsername = sc.nextLine();
        System.out.print("Enter new password: ");
        String newPassword = sc.nextLine();
        boolean loginSuccessful = loginUser(usernames, passwords, newUsername, newPassword);
        if (loginSuccessful) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }
    }
    private static void initializeData(String[] usernames, String[] passwords) {
        usernames[0] = "user1";
        passwords[0] = "pass1";
        usernames[1] = "user2";
        passwords[1] = "pass2";
    }
    private static boolean loginUser(String[] usernames, String[] passwords, String newUsername, String newPassword) {
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i] != null && usernames[i].equals(newUsername) && passwords[i] != null && passwords[i].equals(newPassword)) {
                return true;
            }
        }
        return false;      
    }
}
