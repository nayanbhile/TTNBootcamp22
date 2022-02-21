// Implement multiple inheritance with default method inside  interface.

interface parent 
{
    default void display() 
    {
        System.out.println("Display from PARENT got invoked");
    }
}

interface child1 extends parent 
{
    default void display() 
    {
        System.out.println("Display from CHILD 1 got invoked");
    }
}

interface child2 extends parent 
{
    default void display() 
    {
        System.out.println("Display from CHILD 2 got invoked");
    }
}

public class q8 implements child1, child2 
{
    public void display() 
    {
        child1.super.display();
        child2.super.display();
    }
    public static void main(String gg[])
    {
        new q8().display();
    }
}
