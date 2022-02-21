//Create and access default and static method of an interface.

interface InterfaceQ6
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

public class q6 implements InterfaceQ6 
{

    public static void main(String gg[])
    {
        InterfaceQ6 a1= new q6();
        a1.defaultMethod();
        InterfaceQ6.staticMethod();
    }
}
