import java.util.Scanner;
public class Crud1 {
    private static final int MAX_STUDENTS = 10;
    private static int[] rollNo = new int[MAX_STUDENTS];
    private static String[] name = new String[MAX_STUDENTS];
    private static String[] mobileNo = new String[MAX_STUDENTS];
    private static String[] city = new String[MAX_STUDENTS];
    private static int currentSize = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Input Data");
            System.out.println("2. Show Info");
            System.out.println("3. Delete Student Details");
            System.out.println("4. Update Student Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    inputData(sc);
                    break;
                case 2:
                    showInfo();
                    break;
                case 3:
                    deleteDetails(sc);
                    break;
                case 4:
                    updateDetails(sc);
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);
    }
    private static int findStud(int rNo) {
        for (int i = 0; i < currentSize; i++) {
            if (rollNo[i] == rNo) {
                return i;
            }
        }
        return -1; // Student not found
    }
    private static void inputData(Scanner sc) {
        if (currentSize < MAX_STUDENTS) {
            System.out.print("Enter Roll No: ");
            rollNo[currentSize] = sc.nextInt();
            System.out.print("Enter Name: ");
            name[currentSize] = sc.next();
            System.out.print("Enter Mobile No: ");
            mobileNo[currentSize] = sc.next();
            System.out.print("Enter City: ");
            city[currentSize] = sc.next();
            currentSize++;
            System.out.println("Student data added successfully.");
        } else {
            System.out.println("Maximum number of students reached. Cannot add more.");
        }
    }
    private static void showInfo() {
        if (currentSize > 0) {
            System.out.println("List of students:");
            for (int i = 0; i < currentSize; i++) {
                System.out.println("Roll No: " + rollNo[i] +
                                   ", Name: " + name[i] +
                                   ", Mobile No: " + mobileNo[i] +
                                   ", City: " + city[i]);
            }
        } else {
            System.out.println("No student data available.");
        }
    }
    private static void deleteDetails(Scanner sc) {
        if (currentSize > 0) {
            System.out.print("Enter Roll No to delete: ");
            int rollNoToDelete = sc.nextInt();
            int index = findStud(rollNoToDelete);
            if (index != -1) {
                for (int i = index; i < currentSize - 1; i++) {
                    rollNo[i] = rollNo[i + 1];
                    name[i] = name[i + 1];
                    mobileNo[i] = mobileNo[i + 1];
                    city[i] = city[i + 1];
                }
                rollNo[--currentSize] = 0;
                name[currentSize] = null;
                mobileNo[currentSize] = null;
                city[currentSize] = null;
                System.out.println("Student details deleted successfully.");
            } else {
                System.out.println("Student with Roll No " + rollNoToDelete + " not found.");
            }
        } else {
            System.out.println("No student data available to delete.");
        }
    }
    private static void updateDetails(Scanner sc) {
        if (currentSize > 0) {
            System.out.print("Enter Roll No to update: ");
            int rollNoToUpdate = sc.nextInt();
            int index = findStud(rollNoToUpdate);
            if (index != -1) {
                System.out.print("Enter new Name: ");
                name[index] = sc.next();
                System.out.print("Enter new Mobile No: ");
                mobileNo[index] = sc.next();
                System.out.print("Enter new City: ");
                city[index] = sc.next();
                System.out.println("Student details updated successfully.");
            } else {
                System.out.println("Student with Roll No " + rollNoToUpdate + " not found.");
            }
        } else {
            System.out.println("No student data available to update.");
        }
    }
}