import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stck = new Stack<>();

        for (String ch : tokens) {
            // Check if the current token 'ch' is an operator
            if ("+-*/".contains(ch) && ch.length() == 1) {
                // Pop operands: n2 is the top, n1 is the one below it
                int n2 = stck.pop();
                int n1 = stck.pop();
                
                // Using if-else logic with ch.equals()
                if (ch.equals("+")) {
                    stck.push(n1 + n2);
                } else if (ch.equals("-")) {
                    stck.push(n1 - n2);
                } else if (ch.equals("*")) {
                    stck.push(n1 * n2);
                } else if (ch.equals("/")) {
                    stck.push(n1 / n2);
                }
            } else {
                // If it's a number, parse and push to stck
                stck.push(Integer.parseInt(ch));
            }
        }
        
        // The last remaining value is the result
        return stck.pop();
    }
}