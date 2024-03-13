// import java.util.*;
public class Exception1 {
    public static void main(String[] args) {
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            // int c = a/b;
            System.out.println("Result: "+(a+b));
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Result: "+(5+6));
            System.out.println(e);
        }
        catch(NumberFormatException fe)
        {
            System.out.println("Result: "+(8+14));
            System.out.println(fe);
        }
        catch(ArithmeticException fee)
        {
            System.out.println("Result: "+(11+22));
            System.out.println(fee);
        }
    }
}
