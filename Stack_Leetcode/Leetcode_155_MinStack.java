/** The main problem of the this approach is, for each push operation we are
pushing the element on to min stack also (either the new element or existing minimum element).
That means, we are pushing the duplicate minimum elements on to the stack. */

class MinStack {
    Stack<Integer>elementStack;  //stack to store elements
    Stack<Integer>getMinStack;  //stack to store minimum element
    public MinStack() {
        elementStack = new Stack<Integer>();
        getMinStack = new Stack<Integer>();
    }
    //Insert simultaneously in both the stack
    //If top element of elementStack is <= top element of getMinStack
    //push it on getMinStack else push the top of getMinStack again in GetMinStack
    public void push(int val) {
        elementStack.push(val);
        if(getMinStack.isEmpty() || 
        (!getMinStack.isEmpty() && getMinStack.peek() >= elementStack.peek()))
        {
            getMinStack.push(val);
        }
        else if(!getMinStack.isEmpty() && getMinStack.peek() < elementStack.peek())
        {
            getMinStack.push(getMinStack.peek());
        }
        
    }
    
    //Pop top elements of both stacks simultaneously
    public void pop() {
        if(elementStack.isEmpty()) return;

        elementStack.pop();
        getMinStack.pop();
    }
    
    public int top() {
       
        return elementStack.peek();
    }
    
    public int getMin() {
         
        return getMinStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */