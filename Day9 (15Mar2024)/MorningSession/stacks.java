import java.util.Scanner;
import java.util.EmptyStackException;

class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element.");
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed element: " + value);
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            int popped = stackArray[top--];
            System.out.println("Popped element: " + popped);
            return popped;
        }
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stackArray[top];
        }
    }

    public void traverse() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}

public class stacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();
        
        Stack stack = new Stack(size);
        int choice;
        
        do {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Traverse");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int pushValue = scanner.nextInt();
                    stack.push(pushValue);
                    break;
                case 2:
                    try {
                        int popped = stack.pop();
                    } catch (EmptyStackException e) {
                        System.out.println("Stack is empty. Cannot pop element.");
                    }
                    break;
                case 3:
                    try {
                        int topElement = stack.peek();
                        System.out.println("Top element: " + topElement);
                    } catch (EmptyStackException e) {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 4:
                    stack.traverse();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        
        scanner.close();
    }
}
