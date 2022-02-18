import java.util.ArrayList;
import java.util.ListIterator;

class q1 {
    public static void main(String gg[])
    {
        ArrayList<Float> arrayList=new ArrayList<>();
        Float sum=0f;
        arrayList.add(3.29f);
        arrayList.add(43.5f);
        arrayList.add(65.2f);
        arrayList.add(7f);
        arrayList.add(78.1f);

        ListIterator iterator=arrayList.listIterator();
        while(iterator.hasNext())
        {
            sum+=(Float)iterator.next();
        }

        System.out.println(sum);
    }
}