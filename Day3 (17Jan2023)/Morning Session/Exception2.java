import java.util.*;
class InvalidAgeException extends Exception
{
    public InvalidAgeException()
    {
        System.out.println("Not eligible try after some time");
    }
}
class Exception2{
    static void status(int age) throws InvalidAgeException
    {
        if(age>18)
        {
            System.out.println("Eligible for Marry ");
        }    
        else
        {
            throw new InvalidAgeException();
        }
    }
    public static void main(String[] args) throws InvalidAgeException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        Exception2.status(age);   
        sc.close(); 
    }
}
