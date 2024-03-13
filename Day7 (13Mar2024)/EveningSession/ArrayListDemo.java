import java.util.ArrayList;

class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Object> a1 = new ArrayList<>();
        a1.add("R");
        a1.add(120);
        a1.add("R");
        a1.add(null);
        System.out.println(a1);
        
        a1.remove(2); // Remove element at index 2
        System.out.println(a1);
        
        a1.add(2, "M"); // Add "M" at index 2
        a1.add("N");
        System.out.println(a1);
        
        a1.clear(); // Remove all elements
        System.out.println(a1);
        
        a1.add(0, "C"); // Add "C" at index 0
        System.out.println(a1);
    }
}
