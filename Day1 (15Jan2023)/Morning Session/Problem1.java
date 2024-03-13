import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 5 Digit Number: ");
        int no = sc.nextInt();
        int num1 = no % 10;
        int num2 = no / 10000;
        int sum = num1 + num2;
        System.out.println("Sum is : "+sum);
    }
}
