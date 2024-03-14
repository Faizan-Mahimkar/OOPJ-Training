import java.util.*;

class deletion {
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
        System.out.println("Enter position of element to be deleted: ");
        int pos = sc.nextInt();
        if(pos < 0 || pos >= n )
        {
            System.out.println("Invalid position entered!");
            return ;
        }
        else{
            for(int i=pos; i<n-1; i++)
            {
                arr[i] = arr[i+1];
            }
        }

        System.out.println("The Result is: ");
        for(int i=0;i<n-1;i++)
        {
            System.out.println(arr[i]);
        }
    }
}