import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] mobileNumbers = new String[10];
        System.out.println("Enter 10 mobile numbers of 10 digits each:");
        for (int i = 0; i < 10; i++) {
            mobileNumbers[i] = sc.next();
        }
        Arrays.sort(mobileNumbers);
        for (int i = 0; i < 10; i++) {
            if (i >= 3 && i <= 6) {
                mobileNumbers[i] = mobileNumbers[i] + " Hello";
            } else {
                mobileNumbers[i] = mobileNumbers[i] + " hi";
            }
        }
        System.out.println("Sorted and concatenated mobile numbers:");
        for (String number : mobileNumbers) {
            System.out.println(number);
        }
        sc.close();
    }
}
