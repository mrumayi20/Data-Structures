public class SinglyLinkedList {

    public Node head = null;
    
    public void addNode(int data)
    {
        Node temp = head;
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
        }
        else{
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next= newNode;
        }
    }
    
    public void addNodeAtGivenIndex(int index, int data)
    {
        Node temp = head;
        Node newNode = new Node(data);
        Node prev = temp;
        int i = 1;
        while(index != i && i < index)
        {
             prev = temp;
             temp = temp.next;
            i++;
        }
        
        if (i != index) {
        System.out.println("Invalid index: " + index);
        return;
    }
        prev.next = newNode;
        newNode.next = temp;
        
        
    }
    
    public void display()
    {
        Node temp = head;
        if(temp == null)
        {
            System.out.println("List is Empty\n");
        }
        else
        {
            while(temp != null)
            {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    
    public void delLastEle()
    {
         Node temp = head;
         Node prev = temp;
        if(temp == null)
        {
            System.out.println("No element in the list, element cannot be deleted from the empty list\n");
        }
        else{
            while(temp.next != null)
            {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
        }
    }
    
    public void delFirstElement()
    {
        Node temp = head;
        
        if(temp ==  null)
        {
            System.out.println("First leement cannot be deleted from an empty list");
        }
        else 
        {
            Node prev = temp.next;
            head = prev;
            temp.next = null;
        }
    }
    
    public void delNodeFrmGivenIndex(int index)
    {
        Node temp = head;
        Node prev = temp;
        if(temp ==  null)
        {
            System.out.println("First leement cannot be deleted from an empty list");
        }
        else
        {
            int i = 1;
           while(temp.next!=null)
           {
               if(i == index)
               {
                   prev.next = temp.next;
               }
               prev = temp;
               temp = temp.next;
               i++;
           }
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList m = new SinglyLinkedList();
		m.addNode(1);    
        m.addNode(2);    
        m.addNode(3);    
        m.addNode(4);    
         
        m.display(); 
        //m.delLastEle();
      // m.delFirstElement();
      int index = 3;
       //m.delNodeFrmGivenIndex(index);
        m.addNodeAtGivenIndex(index,5);
        System.out.print("After deleting an element\n");
        m.display(); 
    }
}

class Node{
    int data;
    Node next;
    
    public Node(int data)
    {
        this.data = data;
    }
}
