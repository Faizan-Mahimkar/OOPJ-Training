interface I1{
    void m1();
    interface I2{
        void m2();
    }
}
public class Interface implements I1,I1.I2{
    public void m1(){
        System.out.println("m1 Method");
    }
    public void m2(){
        System.out.println("m2 Method");
    }
    public static void main(String[] args) {
        Interface nt = new Interface();
        nt.m1();
        nt.m2();
    }
}
