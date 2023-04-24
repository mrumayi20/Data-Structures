import java.util.Stack;

/**
 * InfixToPostfixEvaluation
 */
public class InfixToPostfixEvaluation {

    public int infixToPostfix(String exp)
    {
        Stack<Integer> stack = new Stack<>();   
        for(int i = 0 ; i< exp.length() ; i++)
        {
            char c = exp.charAt(i);
            // If the scanned character is an operand
            // (number here), push it to the stack.
           if(Character.isDigit(c))
           {
            stack.push(c - '0'); //getting ascii value of c
           }
           //  If the scanned character is an operator, pop
            //  two elements from stack apply the operator
            else 
            {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(val1+val2);
                        break;
                    case '-':
                        stack.push(val2-val1);
                        break;
                    case '*':
                        stack.push(val1*val2);
                        break;
                    case '/':
                        stack.push(val1/val2);
                        break;
                
                }
            }

        }   
       return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "231*+9-";
        InfixToPostfixEvaluation ItoP = new InfixToPostfixEvaluation();
        int res = ItoP.infixToPostfix(exp);
        System.out.println(res);
    }
}