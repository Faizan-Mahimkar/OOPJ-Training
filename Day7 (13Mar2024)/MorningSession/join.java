class thread extends Thread{
    public void run(){
        for(int i=1;i<=10;i++)
        {
            System.out.println("Child Thread");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException ie){}
        }
    }
}
public class join {
    public static void main(String[] args) throws InterruptedException {
        thread t = new thread();
        t.start();
        t.join();
        for(int i=1;i<=10;i++)
        {
            System.out.println("Main Thread");
        }

    }
}
