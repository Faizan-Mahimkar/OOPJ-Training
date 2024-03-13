import java.util.*;
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> color_list = new ArrayList<>(4);
        color_list.add("White");
        color_list.add("Black");
        color_list.add("Red");
        color_list.add("White");
        System.out.println("*** Color list ***");
        for(int i=0;i<4;i++){
            System.out.println(color_list.get(i).toString());
        }
        ArrayList<String> sample = new ArrayList<>(3);
        sample.add("Yellow");
        sample.add("Red");
        sample.add("White");
        color_list.addAll(sample);
        System.out.println("New size of the List is: "+color_list.size());
        System.out.println("*** Color list ***");
        for(int i=0;i<color_list.size();i++){
            System.out.println(color_list.get(i).toString());
        }
    }
}
