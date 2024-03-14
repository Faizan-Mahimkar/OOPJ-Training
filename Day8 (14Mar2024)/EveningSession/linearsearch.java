import java.util.*;

public class linearsearch {
    public static void main(String[] args) {
        boolean flag;
        int key;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println( "Enter elements of the array : "); 
        for (int i=0 ;i<n ; i++)  
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a number to search in the array");
        key = sc.nextInt();
        flag = false;
        System.out.print("Searching...\n");
        for (int i=0 ; i < n ; i++ )  
        {
            if (arr[i] == key)
            {
                flag = true;
                System.out.println("Element found at position: " + (i+1));
                break;
            }
        }
        if (!flag) {
            System.out.println("Element not found.");
        }
        sc.close();
    }
}