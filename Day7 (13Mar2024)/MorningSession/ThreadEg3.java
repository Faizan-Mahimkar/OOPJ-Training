public class ThreadEg3 extends Thread {
    public void run(){
        System.out.println("run() method");
    }
    public static void main(String[] args) {
        ThreadEg3 t1 = new ThreadEg3();
        ThreadEg3 t2 = new ThreadEg3();
        System.out.println("Name of t1: "+ t1.getName());
        System.out.println("Name of t2: "+ t2.getName());
        t1.start();
        t2.start();
        t1.setName("Faizan");
        System.out.println("After Changing name of t1: "+ t1.getName());
        System.out.println("After Changing name of t2: "+ t2.getName());
    }
}
