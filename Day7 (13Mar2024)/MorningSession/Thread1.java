class A {
    public static synchronized void print(String name)
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("Batting = "+name);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
    }
}

class thread1 extends Thread{
    public void run(){
        A.print("Virat");
    }
}
class thread2 extends Thread{
    public void run(){
        A.print("Faizan");
    }
}
class thread3 extends Thread{
    public void run(){
        A.print("Dhoni");
    }
}

class Thread1{
    public static void main(String[] args) {
        new thread1().start();
        new thread2().start();
        new thread3().start();
    }
}