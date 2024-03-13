class Person{
    void message(){
        System.out.println("I Am Person Class");
    }
}
class Student extends Person{
    void message(){
        System.out.println("I Am Student Class");
    }
    void display(){
        message();
        super.message();
    }
}
public class Super1 {
    public static void main(String[] args) {
        Student stud = new Student();
        stud.display();
    }
}
