import java.util.Scanner;
import java.util.Stack;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of discs: ");
        int numDiscs = scanner.nextInt();
        scanner.close();
        Tower source = new Tower('A');
        Tower auxiliary = new Tower('B');
        Tower destination = new Tower('C');
        for (int i = numDiscs; i > 0; i--) {
            source.push(i);
        }
        solveTowerOfHanoi(numDiscs, source, auxiliary, destination);
    }
    public static void solveTowerOfHanoi(int numDiscs, Tower source, Tower auxiliary, Tower destination) {
        if (numDiscs == 1) {
            moveDisc(source, destination);
            return;
        }
        solveTowerOfHanoi(numDiscs - 1, source, destination, auxiliary);
        moveDisc(source, destination);
        solveTowerOfHanoi(numDiscs - 1, auxiliary, source, destination);
    }
    public static void moveDisc(Tower source, Tower destination) {
        int disc = source.pop();
        destination.push(disc);
        System.out.println("Move disc " + disc + " from " + source.name + " to " + destination.name);
    }
}
class Tower {
    char name;
    Stack<Integer> discs;
    public Tower(char name) {
        this.name = name;
        discs = new Stack<>();
    }
    public void push(int disc) {
        discs.push(disc);
    }
    public int pop() {
        return discs.pop();
    }
}
