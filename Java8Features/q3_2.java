// Create a thread using lambda function

public class q3_2 {
    public static void main(String gg[])
    {
        Thread t=new Thread(()-> {
            System.out.println("Thread got executed");
            try 
            {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            System.out.println("Terminating thread now");
        }
        );

        t.start();
    }

}
