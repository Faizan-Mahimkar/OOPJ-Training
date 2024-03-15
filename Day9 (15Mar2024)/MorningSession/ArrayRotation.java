import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept array input from the user
        System.out.print("Enter the elements of the array separated by spaces: ");
        String input = scanner.nextLine();
        String[] elements = input.split("\\s+");
        int[] arr = Arrays.stream(elements).mapToInt(Integer::parseInt).toArray();
        
        // Accept number of steps to rotate from the user
        System.out.print("Enter the number of steps to rotate: ");
        int steps = scanner.nextInt();
        
        scanner.close();

        int[] rotatedArray = rotateRight(arr, steps);
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Rotated Array: " + Arrays.toString(rotatedArray));
    }

    public static int[] rotateRight(int[] arr, int steps) {
        int n = arr.length;
        int[] rotatedArray = new int[n];

        // Calculate the actual number of steps needed
        steps = steps % n;

        // Copy the elements after rotation
        System.arraycopy(arr, n - steps, rotatedArray, 0, steps);

        // Copy the elements before rotation
        System.arraycopy(arr, 0, rotatedArray, steps, n - steps);

        return rotatedArray;
    }
}
