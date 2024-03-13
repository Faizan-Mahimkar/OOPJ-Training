class Person1{
    Person1(){
        System.out.println("This is person class Constructor");
    }
}
class Student1 extends Person1{
    Student1(){
        super();
        System.out.println("This Student Class Constructor");
    }
}
public class Super2 {
    public static void main(String[] args) {
        Student1 s = new Student1();
    }
}
