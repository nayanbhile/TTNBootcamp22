import java.util.Arrays;

// Find average of the number inside integer list after doubling it.

public class q11 {
    public static void main(String gg[])
    {
        System.out.println(Arrays.asList(1,2,3,4,5,6,7,8,9,10)
              .stream()
              .mapToInt(e->e*2)
              .average());
    }
}
