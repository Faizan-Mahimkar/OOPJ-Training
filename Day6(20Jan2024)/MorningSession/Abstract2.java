abstract class Test{
    abstract void m1();
    abstract void m2();
    abstract void m3();
    void m4(){
        System.out.println("m4 Method");
    }
}
abstract class Test1 extends Test{
    void m1(){
        System.out.println("m1 Method");
    }
}
abstract class Test2 extends Test1{
    void m2(){
        System.out.println("m2 Method");
    }
}
class Abstract2 extends Test2 {
    void m3(){
        System.out.println("m3 Method");
    }
    public static void main(String[] args) {
        Abstract2 a1 = new Abstract2();
        a1.m1();
        a1.m3();
    }
}
