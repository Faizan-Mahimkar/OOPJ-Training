import java.util.Scanner;
public class VowelEncryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        String result = convertToSmallestString(number);
        System.out.println("Lexicographically Smallest String: " + result);
        sc.close();
    }
    private static String convertToSmallestString(long number) {
        String numberString = Long.toString(number);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberString.length(); i++) {
            char currentDigit = numberString.charAt(i);
            if (isPrime(Character.getNumericValue(currentDigit))) {
                result.append(getVowelForDigit(currentDigit));
            } else {
                result.append(getConsonantForDigit(currentDigit));
            }
        }
        return result.toString();
    }
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static char getVowelForDigit(char digit) {
        switch (digit) {
            case '2':
                return 'a';
            case '3':
                return 'e';
            case '5':
                return 'i';
            case '7':
                return 'o';
            default:
                return 'u';
        }
    }
    private static char getConsonantForDigit(char digit) {
        switch (digit) {
            case '1':
                return 'b';
            case '4':
                return 'c';
            case '6':
                return 'd';
            case '8':
                return 'f';
            default:
                return 'g';
        }
    }
}
