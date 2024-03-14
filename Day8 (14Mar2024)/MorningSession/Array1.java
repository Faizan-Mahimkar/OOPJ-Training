import java.util.*;

public class Array1 {
    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        int arr[]=new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n =sc.nextInt();
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter element to be inserted: ");
        int in = sc.nextInt();
        System.out.println("Enter location where element is to be inserted: ");
        int pos = sc.nextInt();
        if(pos < 0 || pos > n )
        {
            System.out.println("Invalid position entered!");
            return;
        }
        else{
            for(int i=n-1; i>=pos; i--)
            {
                arr[i+1] = arr[i];
            }
        }

        arr[pos] = in;
        System.out.print("The Result is: ");
        for(int i=0;i<=n;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
    
}