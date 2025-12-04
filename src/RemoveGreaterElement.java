import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class RemoveGreaterElement {
    public static void main(String[] args) {

     // intput  [10,15,3,0,9]
        //output [10,3,0,7]

        LinkedList<Integer> linkedList =new LinkedList();
        linkedList.add(10);
        linkedList.add(15);
        linkedList.add(3);
        linkedList.add(0);
        linkedList.add(9);

        Iterator<Integer> iter = linkedList.iterator();
        while (iter.hasNext())
        {
            Integer data1 = iter.next();
             Integer data2 = null;
             try{
                  Integer ele2= iter.next();
             }
             catch (NoSuchElementException e){
                 break;
             }
             if (data2>data1){
                 iter.remove();
             }
        }
    }
}
