import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter stock prices for each day:");
        for (int i = 0; i < n; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            prices[i] = scanner.nextInt();
        }

        int[] spans = calculateStockSpan(prices);

        System.out.println("\nStock Prices: ");
        for (int price : prices) {
            System.out.print(price + " ");
        }

        System.out.println("\nStock Spans: ");
        for (int span : spans) {
            System.out.print(span + " ");
        }

        scanner.close();
    }

    private static int[] calculateStockSpan(int[] prices) {
        int n = prices.length;
        int[] spans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            spans[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        return spans;
    }
}
