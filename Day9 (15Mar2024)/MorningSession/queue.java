import java.util.Scanner;

public class queue {
    private int maxSize; 
    private int[] queueArray; 
    private int front; 
    private int rear; 
    private int currentSize; 

    
    public queue(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }

    
    public boolean isEmpty() {
        return currentSize == 0;
    }

    
    public boolean isFull() {
        return currentSize == maxSize;
    }

    
    public int size() {
        return currentSize;
    }

    
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue element.");
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = item;
        currentSize++;
        System.out.println("Enqueued: " + item);
    }

    
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;
        }
        int removedItem = queueArray[front];
        front = (front + 1) % maxSize;
        currentSize--;
        System.out.println("Dequeued: " + removedItem);
        return removedItem;
    }

    
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        int count = 0;
        int index = front;
        while (count < currentSize) {
            System.out.print(queueArray[index] + " ");
            index = (index + 1) % maxSize;
            count++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int size = scanner.nextInt();
        queue queue = new queue(size);

        boolean running = true;
        while (running) {
            System.out.println("\nSelect operation:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int enqueuedItem = scanner.nextInt();
                    queue.enqueue(enqueuedItem);
                    break;
                case 2:
                    int dequeuedItem = queue.dequeue();
                    if (dequeuedItem != -1) {
                        System.out.println("Dequeued element: " + dequeuedItem);
                    }
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close();
    }
}
