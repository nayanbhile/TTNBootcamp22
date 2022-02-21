// Override the default method of the interface.

interface InterfaceQ7
{
    public default void defaultMethod()
    {
        System.out.println("Default Method got invoked");
    }

    public static void staticMethod()
    {
        System.out.println("Static method got invoked");
    }
   
}

public class q7 implements InterfaceQ7 
{
    public void defaultMethod()
    {
        System.out.println("Default method got invoked from the child class");
    }

    public static void main(String gg[])
    {
        InterfaceQ6 a1= new q6();
        q7 a2=new q7();
        a1.defaultMethod();
        a2.defaultMethod();

    }
    
}
