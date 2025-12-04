class Solution {
    public int arraySign(int[] nums) {
        int negativeCount = 0;
        
        for(int n : nums){
            if(n == 0) return 0;      // product becomes zero
            if(n < 0) negativeCount++;
        }
        
        return (negativeCount % 2 == 0) ? 1 : -1;
    }
}
