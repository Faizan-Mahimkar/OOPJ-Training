class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Mammal extends Animal {
    void run() {
        System.out.println("Mammal is running");
    }
}
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
public class MultilevelInheritance{
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  
        myDog.run(); 
        myDog.bark();
    }
}
