import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stck = new Stack<>();

        for (String s : tokens) {
            // Check if the token is an operator
            if ("+-*/".contains(s) && s.length() == 1) {
                // The second operand is popped first (LIFO)
                int n2 = stck.pop();
                int n1 = stck.pop();
                
                switch (s) {
                    case "+": stck.push(n1 + n2); break;
                    case "-": stck.push(n1 - n2); break;
                    case "*": stck.push(n1 * n2); break;
                    case "/": stck.push(n1 / n2); break;
                }
            } else {
                // It's a number, convert and push onto stck
                stck.push(Integer.parseInt(s));
            }
        }
        // The final result is the only thing left in the stck
        return stck.pop();
    }
}