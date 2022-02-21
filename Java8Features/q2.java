


// Create a functional interface whose method takes 2 integers and return one integer.
@FunctionalInterface
interface takeTwoReturnOne
{
    int doIt(int x, int y);
}

public class q2 {
    public static void main(String gg[])
    {
        takeTwoReturnOne aaa=(x,y)->{ return x+y; };
        System.out.println(aaa.doIt(5, 6));
    }
}
