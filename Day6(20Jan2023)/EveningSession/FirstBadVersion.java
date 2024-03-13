import java.util.Scanner;
public class FirstBadVersion {
    static boolean isBadVersion(int version) {
        return version >= 4;
    }
    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of versions: ");
        int totalVersions = sc.nextInt();
        int firstBad = firstBadVersion(totalVersions);
        System.out.println("The first bad version is: " + firstBad);
        sc.close();
    }
}
