class Vehicle{
    int speed=170;
}
class Car extends Vehicle{
    int speed=155;
    void display(){
        System.out.println("Maximum Speed: "+super.speed);
    }
}
public class Super {
public static void main(String[] args) {
    Car c = new Car();
    c.display();
}    
}
