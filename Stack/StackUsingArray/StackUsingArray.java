/**
 * StackUsingArray
 */
public class StackUsingArray {

    int size;
    int array[];
    int top;
    StackUsingArray(int size)
    {
        this.size = size;
        this.array = new int[size];
        this.top = -1;
    }

    public void Push(int data)
    {
        if(top == size)
        {
           System.out.println("Cannot Insert an element in the Stack Because it's Full");
        }
        else
        {
            array[top+1] = data;
            top = top+1;
        }
        
    }

    public void Pop()
    {
        if(top == -1)
        {
            System.out.println("Cannot Delete an element from the Stack Because it's Empty");
        }
        else
        {
            top = top-1;
        }
    }

    public void Print()
    {
        if(top != -1)
        {
            for(int i = 0 ; i <= top ; i++)
            {
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        //int array[] = new int[10];
        StackUsingArray s = new StackUsingArray(10);
        s.Push(1);
        s.Push(2);
        s.Push(3);
        s.Print();
        s.Pop();
        s.Pop();
        s.Print();
        s.Pop();
        s.Pop();
    }
}