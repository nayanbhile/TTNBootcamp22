import java.util.Arrays;
import java.util.stream.Collectors;

// Collect all the even numbers from an integer list.

public class q9 
{
    public static void main(String gg[])
    {
       System.out.println(Arrays.asList(1,2,3,4,5,6,7,8,9,10)
              .stream()
              .filter(e->e%2==0)
              .collect(Collectors.toList()));
              
    }    
}
