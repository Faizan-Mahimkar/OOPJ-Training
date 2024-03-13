import java.util.Scanner;
public class Capgemini2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the Digits: ");
            int[] asciiNumbers = new int[4];
    
            for (int i = 0; i < 4; i++) {
                asciiNumbers[i] = scanner.nextInt();
            }
    
            System.out.print("Sample Output: ");
            for (int i = 0; i < 4; i++) {
                char character = (char) asciiNumbers[i];
                System.out.print(asciiNumbers[i] + "-" + character + " ");
            }
    
            scanner.close();
        }
    }
    
