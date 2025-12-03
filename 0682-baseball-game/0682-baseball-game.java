import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        
        for(String op : operations) {
            switch(op) {
                case "+":
                    stack.push(stack.peek() + stack.get(stack.size() - 2));
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(op));
            }
        }
        
        int sum = 0;
        for(int num : stack) {
            sum += num;
        }
        return sum;
    }
}
