import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("A");
        ts.add("Z");
        ts.add("D");
        ts.add("C");
        ts.add("B");
        System.out.println(ts);
        ts.add(null);
    }
}
