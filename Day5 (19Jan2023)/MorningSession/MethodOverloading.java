class Parent{
    int cash,gold;
    public void properties(){
        System.out.println("Properties: ");
    }
    public void bike(){
        System.out.println("BMMW ");
    }
}
class Child extends Parent{
    public void bike(){
        System.out.println("HB");
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.properties();
        obj.bike();
    }
}
