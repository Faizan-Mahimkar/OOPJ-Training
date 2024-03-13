import java.util.Scanner;
public class RemoveOccurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the character to remove from the first string: ");
        char charToRemove = scanner.next().charAt(0);
        String resultString = removeCharacter(str1, charToRemove);
        System.out.println("Result String: " + resultString);
        scanner.close();
    }
    private static String removeCharacter(String str, char charToRemove) {
        String resultString = str.replaceAll(String.valueOf(charToRemove), "");
        return resultString;
    }
}
