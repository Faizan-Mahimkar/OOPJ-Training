import java.util.Scanner;

public class StringReverse {
    static final int MAX_SIZE = 100;
    static char[] stack = new char[MAX_SIZE];
    static int top = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input from the user
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Push each character onto the stack
        for (char c : input.toCharArray()) {
            push(c);
        }

        // Pop characters from the stack to reverse the string
        String reversedString = "";
        while (top != -1) {
            reversedString += pop();
        }

        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }

    public static void push(char c) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = c;
    }

    public static char pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return '\0';
        }
        return stack[top--];
    }
}
