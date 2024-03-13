class Mythread extends Thread{
    public void run(){
        for(int i=1;i<=10;i++)
        {
            System.out.println("Child Thread");
            Thread.yield();
        }
    }    
}
class Yield{
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
        for(int i=1;i<=10;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
