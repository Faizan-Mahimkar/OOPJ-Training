class MyThread implements Runnable{
    public void run(){
        for(int i=1;i<=10;++i) {
            System.out.println("Child Thread");
        }
    }
}

public class ThreadEg2 {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        Thread t = new Thread(m);
        t.start();
        for(int i=1;i<=10;++i) {
            System.out.println("Main Thread");
        }
    }
}
