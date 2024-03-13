import java.util.Scanner;
public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amount = scanner.nextInt();
        System.out.println("Number of notes for each denomination:");
        int denomination;
        switch (amount / 100) {
            case 0:
                break;
            default:
                denomination = 100;
                System.out.println(denomination + ": " + amount / denomination);
                amount %= denomination;
        }
        switch (amount / 50) {
            case 0:
                break;
            default:
                denomination = 50;
                System.out.println(denomination + ": " + amount / denomination);
                amount %= denomination;
        }
        switch (amount / 20) {
            case 0:
                break;
            default:
                denomination = 20;
                System.out.println(denomination + ": " + amount / denomination);
                amount %= denomination;
        }
        switch (amount / 10) {
            case 0:
                break;
            default:
                denomination = 10;
                System.out.println(denomination + ": " + amount / denomination);
                amount %= denomination;
        }
        switch (amount / 5) {
            case 0:
                break;
            default:
                denomination = 5;
                System.out.println(denomination + ": " + amount / denomination);
                amount %= denomination;
        }
        switch (amount / 2) {
            case 0:
                break;
            default:
                denomination = 2;
                System.out.println(denomination + ": " + amount / denomination);
                amount %= denomination;
        }
        switch (amount) {
            case 0:
                break;
            default:
                denomination = 1;
                System.out.println(denomination + ": " + amount);
        }
        scanner.close();
    }
}
