interface MiniInterface{
    void m1();
    default void m2(){
        System.out.println("Default Method");
    }
    static void m3(){
        System.out.println("Static Method");
    }
}
public class Abstract implements MiniInterface{
    public void m1(){
        System.out.println("Abstract Method");
    }
    public static void main(String[] args) {
        Abstract a = new Abstract();
        a.m1();
        a.m2();
        MiniInterface.m3();
    }
}
