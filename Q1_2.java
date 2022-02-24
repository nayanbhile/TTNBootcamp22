// Explaining the usage of join()

public class Q1_2 {
    public static void main(String gg[]) throws InterruptedException
    {   
        Thread t1=new Thread( new q1Thread1());
        Thread t2=new q1Thread2();
        t1.start();
        t1.join();
        t2.start();
    }
}
