import java.util.Scanner;

class Solution {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow before multiplying by 10
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) 
                return 0;
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) 
                return 0;

            result = result * 10 + digit;
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 32-bit signed integer: ");
        int x = sc.nextInt();

        Solution sol = new Solution();
        int reversed = sol.reverse(x);

        System.out.println("Reversed integer: " + reversed);
    }
}