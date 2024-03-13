public class StringFn4 {
    public static void main(String[] args) {
        String s="Faizan";
        System.out.println(s.startsWith("F"));
        System.out.println(s.startsWith("Faiz"));
        System.out.println(s.endsWith("zan"));
        System.out.println(s.endsWith("wd"));
        boolean b = s.equals("faizan");
        System.out.println(s.equals("Faizan"));
        System.out.println(b);
    }
}
