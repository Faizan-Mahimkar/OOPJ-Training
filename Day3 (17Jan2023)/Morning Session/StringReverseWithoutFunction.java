import java.util.*;
public class StringReverseWithoutFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        String str1 = ReverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + str1);
        sc.close();
    }
private static String ReverseString(String s) {
    char[] charArray = s.toCharArray();
    int start = 0;
    int end = charArray.length - 1;
    while (start < end) {
        char temp = charArray[start];
        charArray[start] = charArray[end];
        charArray[end] = temp;
        start++;
        end--;
    }
    return new String(charArray);
}
}

