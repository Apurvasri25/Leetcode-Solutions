import java.util.*;

class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += (num < 10 ? num : -num);
        return sum != 0;
    }
}
