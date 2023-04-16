/**
 * DoublyLinkedList
 */
public class DoublyLinkedList {

    public Node head = null;
    public Node tail = null;

    public void DisplayForward()
    {
        Node temp = head;
         if(temp == null)
         {
            System.out.println("No Element in linked list to display");
         }  
         else
         {           
            System.out.println("Displaying elements in the forward direction"); 
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
         }
    }

     public void DisplayBackwards()
    {
        Node temp = tail;
         if(temp == null)
         {
            System.out.println("No Element in linked list to display");
         }  
         else
         {      
             System.out.println("Displaying elements in the backward direction");       
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.prev;
            }
         }
    }

    public void InsertFront(int data)
    {
        Node newNode = new Node(data);
        Node temp = head;
        if(temp == null)
        {
            temp = newNode;
            temp.next = null;
            temp.prev = null;
            head = temp;
            tail = temp;
        }
        else
        {
            temp.prev = newNode;
            newNode.next = temp;
            temp = temp.prev;
            head = temp;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            tail = temp;
        }

    }

    public void InsertInTheEnd(int data)
    {
         Node newNode = new Node(data);
         Node temp = tail;
         if(temp == null)
         {
            temp = newNode;
            head = tail = temp;
            temp.next = null;
            temp.prev = null;
         }
         else{
            temp.next = newNode;
            newNode.prev = temp;
            temp = temp.next;
            tail = temp;
         }
         
    }
    public void InsertinTheMiddle(int data, int index)
    {
           Node newNode = new Node(data);
           Node temp = head;
           Node back = head;
           int i = 1;
           if(temp == null && index > i)
           {
            System.out.println("No element in the list, cannot insert at the position you asked for");
            return;
           }
           else
           {
            while(index != i)
            {
                back = temp;
                temp = temp.next;
                i++;
            }

            newNode.next = temp;
            temp.prev = newNode;
            newNode.prev = back;
            back.next = newNode;

           }
    }

    public void DeleteFirstNode()
    {
        Node temp = head;
        if(temp == null)
        {
            System.out.println("No element in the list to delete");
            return;
        }
        else
        {
            temp = temp.next;
            head = temp;
            temp.prev = null;
        }
    }

    public void DeleteLastNode()
    {
        Node temp = tail;
        if(temp == null)
        {
            System.out.println("No element in the list to delete");
            return;
        }
        else
        {
            temp = temp.prev;
            tail = temp;
            temp.next = null;
        }
    }
    public void DeleteNodeAtGivenIndex(int index)
    {
        Node temp = head;
        Node back = head;
        int i =1;
        while(i != index && i < index)
        {
            back = temp;
            temp = temp.next;
            i++;
        }
        back.next = temp.next;
        temp = temp.next;
        temp.prev = back;

    }
    public static void main(String[] args) {
        DoublyLinkedList d = new DoublyLinkedList();
        
        d.InsertFront(4);
        //d.DisplayForward();
        d.InsertFront(2);
        //d.DisplayForward();
        d.InsertFront(1);
        //d.DisplayForward();
        d.InsertInTheEnd(5);

        d.InsertinTheMiddle(3, 3);
       // d.DeleteFirstNode();
       //d.DeleteLastNode(); 
       d.DeleteNodeAtGivenIndex(3);
       d.DisplayForward();
        d.DisplayBackwards();
    }
}

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;        
    }
}