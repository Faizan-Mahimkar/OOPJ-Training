import java.util.Scanner;

public class Accenture1{
    public static int distributeFood(int r, int unit, int[] arr) {
        // Check for null array
        if (arr == null) {
            return -1;
        }

        // Calculate the total amount of food required for all rats
        int totalFoodRequired = r * unit;

        // Calculate the amount of food in the houses
        int foodInHouses = 0;
        int distributedFood = 0;

        for (int i = 0; i < arr.length; i++) {
            foodInHouses += arr[i];

            if (foodInHouses >= totalFoodRequired) {
                distributedFood = i + 1; // Number of houses with sufficient food
                break;
            }
        }

        return distributedFood;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rats (r): ");
        int r = scanner.nextInt();

        System.out.print("Enter the amount of food each rat consumes (unit): ");
        int unit = scanner.nextInt();

        System.out.print("Enter the number of houses (n): ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the amount of food in each house:");

        for (int i = 0; i < n; i++) {
            System.out.print("House " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int result = distributeFood(r, unit, arr);

        System.out.println("\nOutput:");
        System.out.println(result);

        scanner.close();
    }

    private static String formatIntArray(int[] arr) {
        StringBuilder formattedArray = new StringBuilder();
        formattedArray.append("[");
        for (int i = 0; i < arr.length; i++) {
            formattedArray.append(arr[i]);
            if (i < arr.length - 1) {
                formattedArray.append(", ");
            }
        }
        formattedArray.append("]");
        return formattedArray.toString();
    }
}