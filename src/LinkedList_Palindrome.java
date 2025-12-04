import linked_List_Implementaion.LinkedLists;

import java.util.LinkedList;

public class LinkedList_Palindrome {
    public static void main(String[] args) {

        LinkedList <Integer>l=new LinkedList<Integer>();
        l.add(5);
        l.add(4);
        l.add(3);
        l.add(2);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);


        }
    public static boolean rev(LinkedList l){
        for (int i =0,j=l.size();i<(l.size()/2);i++,j--)
        {
            if (l.get(i)!=l.get(j)){
                return false;
            }


        }
        return true;
    }
}
