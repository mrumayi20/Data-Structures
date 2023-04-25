/**
 * TwoStacksUsingOneArray
 */
public class TwoStacksUsingOneArray {
    private int array[];   
    private int top1, top2, size;
    public TwoStacksUsingOneArray(int size)
    {
        if(size < 2) throw new IllegalStateException("Size < 2 is not permissible");
        array = new int[size];
        this.size = size;
        this.top1 = -1;
        this.top2 = size;
    }

    public void push(int data, int StackNo)
    {
       if(StackNo == 1)
       {
         //think of exception condition
         top1 = top1+1;
         array[top1] = data;
       }
       else if(StackNo == 2)
       {
          top2 = top2-1;
          array[top2] = data;
       }
       else{
        System.out.println("There are only two stacks");
       }
    }

    public int pop(int stackNo)
    {
       if(stackNo == 1 && top1 != -1)
       {         
         int toReturn = array[top1];
         top1 = top1-1;
         return toReturn;
       }
       else if(stackNo == 2 && top2 != size)
       {
        int toReturn = array[top2];
        top2 = top2+1;
        return toReturn;
       }
       return 0;
    }

    public void peek(int stackNo)
    {
        if(stackNo == 1 && top1 !=-1)
       {         
         int toReturn = array[top1];
         System.out.println("Top of stack 1: "+toReturn);
        
       }
       else if(stackNo == 2 && top2 != size)
       {
        int toReturn = array[top2];
        System.out.println("Top of stack 1: "+toReturn);
        
       }
       System.out.println("Stack is Empty");
       
    }
    public static void main(String[] args) {
        TwoStacksUsingOneArray stacksUsingOneArray = new TwoStacksUsingOneArray(10);
        stacksUsingOneArray.push(1, 1);
        stacksUsingOneArray.push(10, 2);
        stacksUsingOneArray.push(2, 1);
        stacksUsingOneArray.push(9, 2);
        stacksUsingOneArray.pop(1);
        stacksUsingOneArray.peek(1);
        stacksUsingOneArray.peek(2);
        
    }
}