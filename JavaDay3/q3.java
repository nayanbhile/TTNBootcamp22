
public class q3 {
    public static void main(String gg[])
    {
        SpecialStack stack=new SpecialStack(10);
        System.out.println("****Printing empty stack**** \n"+stack);
        System.out.println("-----------Min value: "+stack.getMin()+"------------");

        System.out.println("\n****Pushing to stack****");
        stack.push(100);
        stack.push(60);
        stack.push(20);
        stack.push(80);
        stack.push(50);
        stack.push(10);
        stack.push(90);

        System.out.println("-----------Min value: "+stack.getMin()+"------------");

        System.out.println("\n****Printing stack**** \n"+stack);
        System.out.println("****Popping from stack****");
        System.out.println("Popped: "+stack.pop());
        System.out.println("Popped: "+stack.pop());
        System.out.println("Popped: "+stack.pop());
        System.out.println("-----------Min value: "+stack.getMin()+"------------");

        System.out.println("-----------Is stack empty? "+stack.isEmpty()+"------------");
        System.out.println("-----------Is stack full? "+stack.isFull()+"------------");

        System.out.println("\n****Printing Final stack**** \n"+stack);

        
        
    }
}
