class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) return 0;

        int maxLen = 1;  // at least one element is an increasing subsequence
        int currLen = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currLen++;    // continue increasing sequence
                maxLen = Math.max(maxLen, currLen);
            } else {
                currLen = 1;  // reset when sequence breaks
            }
        }

        return maxLen;
    }
}
