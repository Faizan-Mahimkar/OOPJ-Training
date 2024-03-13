import java.util.Scanner;
public class StringConversionStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string (s): ");
        String s = sc.nextLine();
        System.out.print("Enter the second string (t): ");
        String t = sc.nextLine();
        int StepsRequired = NoOfSteps(s, t);
        System.out.println("Number of operations required: " + StepsRequired);
        sc.close();
    }
    private static int NoOfSteps(String s, String t) {
        int s1 = s.length();
        int t1 = t.length();
        int[][] dp = new int[s1 + 1][t1 + 1];
        for (int i = 0; i <= s1; i++) {
            for (int j = 0; j <= t1; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + min(dp[i - 1][j], dp[i][j - 1], dp[i - 1][j - 1]);
                }
            }
        }
        return dp[s1][t1];
    }
    private static int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
