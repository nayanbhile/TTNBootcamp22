import java.util.Arrays;

// Find the first even number in the integer list which is greater than 3.

public class q12 
{
    public static void main(String gg[])
    {
        System.out.println(Arrays.asList(1,2,3,4,5,6,7,8,9,10)
              .stream()
              .filter(e->e>3)
              .filter(e->e%2==0)
              .findFirst());
    }
}
