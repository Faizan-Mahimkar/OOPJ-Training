
public class NormalArg {
    void m1(char ch,int... a){
        System.out.print(ch);
        for(int a1:a){
            System.out.print(" "+a1);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        NormalArg t = new NormalArg();
        t.m1('A');
        t.m1('B',10);
        t.m1('C',10,20);
        t.m1('D',10,20,30,40);
    }
}
