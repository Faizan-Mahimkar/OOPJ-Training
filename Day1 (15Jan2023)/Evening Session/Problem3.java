import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for three papers:");
        int paper1 = scanner.nextInt();
        int paper2 = scanner.nextInt();
        int paper3 = scanner.nextInt();
        System.out.println("Enter gender (Male/Female):");
        String gender = scanner.next();
        int totalMarks = paper1 + paper2 + paper3;
        double percentage = (totalMarks / 3.0); // Using 3.0 for floating-point division
        boolean isEligibleForAdmission = (percentage >= 62 && gender.equalsIgnoreCase("Female"));
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        if (isEligibleForAdmission) {
            System.out.println("Congratulations! You are eligible for admission.");
        } else {
            System.out.println("Sorry, you are not eligible for admission.");
        }
        scanner.close();
    }
}
