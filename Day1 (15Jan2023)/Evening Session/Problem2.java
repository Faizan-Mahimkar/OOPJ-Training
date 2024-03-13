import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for three papers:");
        int paper1 = scanner.nextInt();
        int paper2 = scanner.nextInt();
        int paper3 = scanner.nextInt();
        int passingThreshold = 45;
        String resultPaper1 = (paper1 >= passingThreshold) ? "Pass" : "Fail";
        String resultPaper2 = (paper2 >= passingThreshold) ? "Pass" : "Fail";
        String resultPaper3 = (paper3 >= passingThreshold) ? "Pass" : "Fail";
        System.out.println("Paper 1: " + resultPaper1);
        System.out.println("Paper 2: " + resultPaper2);
        System.out.println("Paper 3: " + resultPaper3);
        scanner.close();
    }
}
