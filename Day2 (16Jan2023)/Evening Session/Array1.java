import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("\nOriginal Array: ");
        printArray(array);
        int[] nextLarger = findNextLargerElements(array);
        System.out.println("\nNext Larger Element Array: ");
        printArray(nextLarger);
        scanner.close();
    }
    private static int[] findNextLargerElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = -1; 
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    result[i] = arr[j];
                    break; 
                }
            }
        }
        return result;
    }
    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
