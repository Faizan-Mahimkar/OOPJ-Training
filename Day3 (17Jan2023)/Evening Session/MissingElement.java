import java.util.Scanner;
public class MissingElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array (N): ");
        int N = scanner.nextInt();
        int[] array = new int[N - 1];
        System.out.println("Enter " + (N - 1) + " distinct integers in the range 1 to " + N + ":");
        for (int i = 0; i < N - 1; i++) {
            array[i] = scanner.nextInt();
        }
        int missingElement = findMissingElement(N, array);
        System.out.println("Missing Element: " + missingElement);
        scanner.close();
    }
    private static int findMissingElement(int N, int[] array) {
        int totalSum = N * (N + 1) / 2;
        int arraySum = 0;
        for (int num : array) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }
}
