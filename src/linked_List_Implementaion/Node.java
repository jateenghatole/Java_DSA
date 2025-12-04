package linked_List_Implementaion;

public class Node {
    Object val;
    Node nextNode;

    Node(int data)
    {
        this.val=data;
        this.nextNode=null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", nextNode=" + nextNode +
                '}';
    }
}
