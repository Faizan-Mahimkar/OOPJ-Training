import java.util.Scanner;
public class PowerOfFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean isPowerOfFour = checkPowerOfFour(num);
        if (isPowerOfFour) {
            System.out.println(num + " is a power of four.");
        } else {
            System.out.println(num + " is not a power of four.");
        }
        scanner.close();
    }
    private static boolean checkPowerOfFour(int num) {
        return (num > 0) && ((num & (num - 1)) == 0) && ((num & 0x55555555) != 0);
    }
}
