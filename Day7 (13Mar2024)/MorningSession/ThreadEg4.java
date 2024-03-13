public class ThreadEg4 extends Thread {
    public void run(){
        System.out.println("Inside Run Method");
    }
    public static void main(String[] args) {
        ThreadEg4 t1 = new ThreadEg4();
        ThreadEg4 t2 = new ThreadEg4();
        ThreadEg4 t3 = new ThreadEg4();
        System.out.println("t1 Thread Priority: "+ t1.getPriority());
        System.out.println("t2 Thread Priority: "+ t2.getPriority());
        System.out.println("t3 Thread Priority: "+ t3.getPriority());
        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);
        System.out.println("t1 Thread Priority: "+ t1.getPriority());
        System.out.println("t2 Thread Priority: "+ t2.getPriority());
        System.out.println("t3 Thread Priority: "+ t3.getPriority());
        System.out.print(Thread.currentThread().getName());
        System.out.println("Main Thread Priority: "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Main Thread Priority: "+ Thread.currentThread().getPriority());
    }
}
