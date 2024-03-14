import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] percentages = new double[10];
        System.out.println("Enter the percentages of 10 students:");
        for (int i = 0; i < 10; i++) {
            percentages[i] = sc.nextDouble();
        }
        selectionSort(percentages);
        double topperPercentage = percentages[9];
        int location = binarySearch(percentages, topperPercentage);
        if (location != -1) {
            System.out.println("Location of the topper's percentage in the result: " + location);
        } else {
            System.out.println("No");
        }
        sc.close();
    }
    public static void selectionSort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static int binarySearch(double[] arr, double target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
