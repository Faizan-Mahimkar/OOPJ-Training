import java.util.*;
public class Capgemini3 {
    public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        StringBuilder compressedString = new StringBuilder();
        char currentChar = input.charAt(0);
        int charCount = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                charCount++;
            } else {
                compressedString.append(currentChar);
                if (charCount > 1) {
                    compressedString.append(charCount);
                }
                currentChar = input.charAt(i);
                charCount = 1;
            }
        }
        compressedString.append(currentChar);
        if (charCount > 1) {
            compressedString.append(charCount);
        }
        return compressedString.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String which you want to compress: ");
        String input = sc.nextLine();
        // String input = "aabbbbeeeeffggg";
        String compressed = compressString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + compressed);
        sc.close();
    }
}
