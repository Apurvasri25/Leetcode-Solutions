import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stck = new Stack<>();

        for (String s : tokens) {
            if ("+-*/".contains(s) && s.length() == 1) {
                int n2 = stck.pop();
                int n1 = stck.pop();
                switch (s) {
                    case "+": stck.push(n1 + n2); break;
                    case "-": stck.push(n1 - n2); break;
                    case "*": stck.push(n1 * n2); break;
                    case "/": stck.push(n1 / n2); break;
                }
            } else {
                stck.push(Integer.parseInt(s));
            }
        }
        return stck.pop();
    }
}