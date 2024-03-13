public class Pattern2SumOfRow {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 4; i++) {
            int rowSum = 0; 
            for (int j = 1; j <= 4; j++) {
                System.out.print(count + " ");
                rowSum += count++;
            }
            System.out.println("=> Row Sum: " + rowSum);
        }
    }
}
