package linked_List_Implementaion;

public class LinkedLists {

    Node head;
    int size;

    LinkedLists()
    {
        this.head=null;
    }

    public void add(int data)
    {
        Node newNode =new Node(data);
        if (head==null){
            head=newNode;
        }
        else {
            Node cahlu =head;
            while(cahlu.nextNode!=null)
            {
                cahlu=cahlu.nextNode;
            }
            cahlu.nextNode=newNode;
        }
        size++;
        System.out.println("added the node");
    }

//    public void removeGreater()

    public void resverse()
    {

    }

}
