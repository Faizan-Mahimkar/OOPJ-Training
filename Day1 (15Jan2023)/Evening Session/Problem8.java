import java.util.Scanner;
public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for four papers:");
        int paper1 = scanner.nextInt();
        int paper2 = scanner.nextInt();
        int paper3 = scanner.nextInt();
        int paper4 = scanner.nextInt();
        int totalMarks = paper1 + paper2 + paper3 + paper4;
        double percentage = (totalMarks / 4.0);
        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else if (percentage >= 40) {
            grade = "E";
        } else {
            grade = "Fail";
        }
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
