public class CircularLinkedList {

    public Node head = null;
    public void Display()
    {
        Node temp = head;
        if(temp == null)
        {
            System.out.println("No element in the list to display");
            return;
        }
        else
        {
            while(temp.next != head)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }

    }

    public void InsertInEnd(int data)
{
    Node newNode = new Node(data);
    Node temp = head;
    if (temp == null) {
        temp = newNode;
        head = temp;
        temp.next = head;
    } else {
        while(temp.next != head)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }   
}
 
    public void Count()
    {
       if(head == null)
       {
        System.out.println("Length is 0");
        return;
       }
       else
       {
        Node temp = head;
         int count = 0;
         while(temp.next != head)
         {
            count++;
            temp = temp.next;
         }
         count++;
         System.out.println("Length is " + count);
       }
    }

    public void InsertAtFront(int data)
    {
        Node newNode = new Node(data);
        Node temp = head;
        if(temp == null)
        {
            temp = newNode;
            temp.next = temp;
            head = temp;
        }
        else
        {
            while(temp.next != head)
            {
                temp = temp.next;                
            }
            temp.next = newNode;
            newNode.next = head;
            head = temp.next;
        }

    }
    
    public void DeleteLastNode()
    {
        Node temp = head;
        if(temp == null)
        {
            System.out.println("No Node to be deleted in the list");
            return;
        }
        else
        {
            Node prev = temp;
            while(temp.next != head)
            {
               prev = temp;
               temp = temp.next;
            }
            prev.next = temp.next;

        }
    }

    public void DeleteFirstNode()
    {
        Node temp = head;
        if(temp == null)
        {
            System.out.println("No Node to be deleted in the list");
            return;
        }
        else
        {
            while(temp.next != head)
            {               
                temp = temp.next;
            }            
            temp.next = head.next;
            head = temp.next;
        }
    }
    public static void main(String[] args) {
        CircularLinkedList c = new CircularLinkedList();
        c.InsertInEnd(1);
        c.InsertInEnd(2);
        c.InsertInEnd(3);   
        c.InsertAtFront(4);   
        //c.DeleteLastNode(); 
        c.DeleteFirstNode();
        c.Display();
        c.Count();
    }
}

 class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}