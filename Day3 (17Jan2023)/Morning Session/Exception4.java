import java.util.Scanner;
class InvalidUsernamePasswordException extends Exception {
    public InvalidUsernamePasswordException(String message) {
        super(message);
    }
}
class Authenticator {
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password123";
    public void authenticate(String username, String password) throws InvalidUsernamePasswordException {
        if (!username.equals(VALID_USERNAME) || !password.equals(VALID_PASSWORD)) {
            throw new InvalidUsernamePasswordException("Invalid username or password");
        } else {
            System.out.println("Authentication successful!");
        }
    }
}
public class Exception4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        Authenticator authenticator = new Authenticator();
        try {
            authenticator.authenticate(username, password);
        } catch (InvalidUsernamePasswordException e) {
            System.out.println("Authentication failed: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
