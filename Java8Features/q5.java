/*

Implement following functional interfaces from java.util.function using lambdas:

(1) Consumer

(2) Supplier

(3) Predicate

(4) Function

*/

import java.util.function.*;

public class q5 
{
    public static void main(String gg[])
    {
        System.out.println("Testing Consumer");
        Consumer<Integer> consumer=a->System.out.println(a);
        consumer.accept(500);

        System.out.println("\nTesting Supplier");
        Supplier<Integer> supplier= ()->100;
        System.out.println(supplier.get());

        System.out.println("\nTesting Predicate");
        Predicate<Integer> predicate=a->a>5;
        System.out.println(predicate.test(10));
        System.out.println(predicate.test(4));

        System.out.println("\nTesting Function");
        Function<Integer,Integer> function=s->s*10;
        System.out.println(function.apply(7));
    }   
}
