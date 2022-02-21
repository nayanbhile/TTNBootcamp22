interface allFunctionalInterfacesq3
{
    int doIt(int x, int y);
}

public class q3 {

    int add(int x,int y)
    {
        return x+y;
    }

    int subtract(int x,int y)
    {
        return x-y;
    }

    static int multiply(int x,int y)
    {
        return x*y;
    }

    public static void main(String gg[])
    {
        // Using (instance) Method reference create and apply add and subtract method
        allFunctionalInterfacesq3 add=new q3()::add;
        allFunctionalInterfacesq3 subtract= new q3()::subtract;
        allFunctionalInterfacesq3 multiply=q3::multiply;

        System.out.println("Adding 10 and 6: "+add.doIt(10, 6));
        System.out.println("Subtracting 6 from 10: "+subtract.doIt(10, 6));
        System.out.println("Multiplying 10 and 6: "+multiply.doIt(10, 6));
    }
}
