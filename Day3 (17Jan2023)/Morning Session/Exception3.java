import java.util.*;
class InvalidAgeException1 extends Exception
{
    public InvalidAgeException1(String str)
    {
        System.out.println(str);
    }
}
class Exception3 {
    static void status(int age) throws InvalidAgeException1
    {
        if(age>18){
            System.out.println("Eligible for Marry");
        }
        else{
            throw new InvalidAgeException1("Not able to Marry try after some time");
        }
    }
    public static void main(String[] args) throws InvalidAgeException1{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        Exception3.status(age);
        sc.close();
    }
}
