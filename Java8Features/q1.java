@FunctionalInterface
interface greaterOrNot
{
    boolean find(int x, int y);
}

@FunctionalInterface
interface increaseByOne
{
    int doIt(int y);
}

@FunctionalInterface
interface concatTwoStrings
{
    String doIt(String x, String y);
}

@FunctionalInterface
interface convertToUpperCase
{
    String convert(String s);
}


public class q1 {
    public static void main(String[] args) 
    {
        // (1) First number is greater than second number or not  
        greaterOrNot a=(x,y)-> x>y;
        System.out.println("Is 3 greater than 4? "+ a.find(3,4));
        System.out.println("Is 4 greater than 3? "+ a.find(4,3));


        // (2) Increment the number by 1 and return incremented value
        increaseByOne b=e->e+1;
        System.out.println("\nIncreasing 5 by one- " + b.doIt(5));

        // (3) Concatination of 2 string                             
        concatTwoStrings c=(x,y)->x+y;
        System.out.println("\nConcatinating two strings: 1. Nayan 2. Bhile - "+ c.doIt("Nayan", "Bhile"));

        // (4) Convert a string to uppercase and return .
        convertToUpperCase d= (e)-> {
            return e.toUpperCase();
        };
        System.out.println("\nConverting ttn to upper case- "+ d.convert("ttn"));


        
    }
        
}
