import java.util.Scanner;

public class ReverseArrayUsingStack {
    static final int MAX_SIZE = 100;
    static int[] stack = new int[MAX_SIZE];
    static int top = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        reverseArray(array);

        System.out.println("Reversed array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            push(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = pop();
        }
    }

    public static void push(int element) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = element;
    }

    public static int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        return stack[top--];
    }
}
