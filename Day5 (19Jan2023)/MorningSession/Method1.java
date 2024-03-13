public class Method1 {
    void m1(int... n){
        System.out.println("Faizan");
    }
    public static void main(String[] args) {
        Method1 m = new Method1();
        m.m1();
        m.m1(10);
        m.m1(10,20);
        m.m1(10,20,30);
    }
}
