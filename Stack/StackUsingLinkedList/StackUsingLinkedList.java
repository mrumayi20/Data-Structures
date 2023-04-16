/**
 * StackUsingLinkedList
 */
public class StackUsingLinkedList {

    public Node top = null;

    public boolean isEmpty()
    {
        if(top == null)
        {
            return true;
        }
       return false;
    }


    public void Push(int data)
    {
      Node newNode  = new Node(data);
      Node temp = top;
      if(isEmpty()) 
      {
        temp = newNode;
        temp.next = null;
        top = temp;
      }
      else{
          newNode.next = top;
          top = newNode;
      }
    }

    public void Pop()
    {
        
        if(isEmpty())
        {
            System.out.println("No elements to be deleted in the satck");
            return;
        }
        else
        {
            top = top.next;
        }
    }

    public void Display()
    {
       Node temp = top;
       if(isEmpty())
       {
        System.out.println("No elements to be displayed in the satck");
        return;
       }
       else
       {
          while(temp != null)
          {
            System.out.println(temp.data);
            temp = temp.next;
          }

       }
    }

    public static void main(String[] args) {
        StackUsingLinkedList s = new StackUsingLinkedList();
        s.Push(1);
        s.Push(2);
        s.Push(3);
        s.Push(4);
        s.Display();
        System.out.println("poping the element out of stack");
        s.Pop();
        s.Display();
    }
}

class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
    }
}
