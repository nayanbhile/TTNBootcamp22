import java.util.Arrays;

// Sum all the numbers greater than 5 in the integer list.

public class q10 {
    public static void main(String gg[])
    {
        System.out.println(Arrays.asList(1,2,3,4,5,6,7,8,9,10)
              .stream()
              .filter(e->e>5)
              .mapToInt(e->e)
              .sum());
    }
}
