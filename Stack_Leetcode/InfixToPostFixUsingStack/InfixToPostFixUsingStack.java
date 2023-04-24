import java.util.Deque;
import java.util.ArrayDeque;
//import java.util.Stack;//becaue i want to use arrays inbuild methods


/**
 * InfixToPostFixUsingStack
 */
public class InfixToPostFixUsingStack {
 
    /** This Method is to determine the precedence of an operator */
    public int precedence(char c)
    {
         switch (c) {
            case '+':
            case '-':   
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
               return 3;         
         }
         return -1;
    }

    /**This method converts the infix expression into it's postfix expression */
    public String infixToPostfix(String exp)
    {
        String result = new String("");
        Deque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0 ; i < exp.length() ; i++) {
            char c = exp.charAt(i);
           if(c == '(')
           {
            //if open paranthesis, push it on stack
            stack.push(c);
           }
           else if(Character.isLetterOrDigit((c)))
           {
            //append letter or digit to the result string
              result+=c;
           }
           else if(c == ')')
           {
              while(!stack.isEmpty() && stack.peek()!='(')
              {
                 result+=stack.peek();
                 stack.pop();
              }
              stack.pop();   //to pop '('
           }
           else{
              //if an operator is encountered
              while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek()))
              {
                   result += stack.peek();
                   stack.pop();
              }
              stack.push(c);
           }
        }

        //pop all the operators from the stack
        while(!stack.isEmpty())
        {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.peek();
             stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "a+b*(c^d-e)^(f+g*h)-i";
        InfixToPostFixUsingStack s = new InfixToPostFixUsingStack();
        String res = s.infixToPostfix(str);

        System.out.println(res);
    }
}