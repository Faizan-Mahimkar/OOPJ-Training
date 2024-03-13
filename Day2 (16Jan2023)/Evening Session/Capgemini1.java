import java.util.Scanner;
public class Capgemini1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of semesters: ");
            int numSemesters = scanner.nextInt();
            if (numSemesters <= 0) {
                System.out.println("Invalid number of semesters. Please enter a positive integer.");
                return;
            }
            int[] maxMarks = new int[numSemesters];
            int[] numSubjects = new int[numSemesters];
            for (int semester = 1; semester <= numSemesters; semester++) {
                System.out.print("Enter the number of subjects for Semester " + semester + ": ");
                numSubjects[semester - 1] = scanner.nextInt();
                if (numSubjects[semester - 1] <= 0) {
                    System.out.println("Invalid number of subjects for Semester " + semester + ".");
                    return;
                }
            }
            for (int semester = 1; semester <= numSemesters; semester++) {
                maxMarks[semester - 1] = Integer.MIN_VALUE;
                System.out.println("Enter marks for Semester " + semester + ": ");
                for (int subject = 1; subject <= numSubjects[semester - 1]; subject++) {
                    System.out.print("Subject " + subject + ": ");
                    int marks = scanner.nextInt();
                    if (marks < 0 || marks > 100) {
                        System.out.println("You have entered invalid marks for Semester " + semester + ", Subject " + subject + ".");
                        return;
                    }
                    if (marks > maxMarks[semester - 1]) {
                        maxMarks[semester - 1] = marks;
                    }
                }
            }
            for (int semester = 1; semester <= numSemesters; semester++) {
                System.out.println("Maximum marks in Semester " + semester + ": " + maxMarks[semester - 1]);
            }
            scanner.close();
        }
    }
}
