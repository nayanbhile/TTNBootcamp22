import java.util.LinkedList;

public class SpecialStack 
{
    int top=0;
    int min=999999999;
    int maxSize=0;
    LinkedList<Integer> stack;

    public SpecialStack(int maxSize) 
    {
        this.stack=new LinkedList<Integer>();
        this.maxSize=maxSize;
    }

    public boolean push(Integer element)
    {
        if(this.stack.size()==this.maxSize) return false;
        this.stack.add(0, element);
        if(element<min) min=element;
        return true;
    }

    public Integer pop()
    {
        Integer i=this.stack.removeFirst();
        if(min==i) 
        {
            min=this.stack.getFirst();
            for(Integer j : this.stack) 
            {
                if(j<min) min=j;
            }
        }
        
        return i;
    }

    public boolean isEmpty()
    {
        return this.stack.size()==0;
    }

    public boolean isFull()
    {
        return this.stack.size()==this.maxSize;
    }

    public Integer getMin()
    {
        return this.min;
    }

    @Override
    public String toString() 
    {
        StringBuffer sb = new StringBuffer();
        int i=0;
        while(i<this.stack.size()) 
        {
            sb.append(String.valueOf(this.stack.get(i))+"\n");
            i++;
        }
        return sb.toString();
    }

    
}
