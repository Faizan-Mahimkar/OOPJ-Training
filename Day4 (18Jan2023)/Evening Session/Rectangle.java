class Rect{
    int l,h;
    public Rect(int l,int h){
        this.l=l;
        this.h=h;
    }
    void show(){
        System.out.println("Area is: "+(l*h));
    }
}
public class Rectangle {
    public static void main(String[] args) {
        Rect r1=new Rect(4,5);
        Rect r2=new Rect(5,8);
        r1.show();
        r2.show();
    }
}
