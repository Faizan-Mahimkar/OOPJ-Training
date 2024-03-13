import java.util.Scanner;
public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the cost price: ");
        double costPrice = scanner.nextDouble();
        System.out.print("Are you a student? (yes/no): ");
        String studentStatus = scanner.next().toLowerCase(); 
        double discount;
        if (studentStatus.equals("yes")) {
            if (costPrice > 500) {
                discount = 0.10;
            } else {
                discount = 0.05;
            }
        } else {
            if (costPrice > 500) {
                discount = 0.08;
            } else {
                discount = 0.02;
            }
        }
        double netPrice = costPrice - (costPrice * discount);
        double c= costPrice-netPrice;
        System.out.println("Cost Price: Rs. " + costPrice);
        System.out.println("Discount Given: Rs. " + c);
        System.out.println("Net Price: Rs. " + netPrice);
        scanner.close();
    }
}
