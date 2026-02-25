class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int n = nums.length;

        // If already semi-ordered
        if (nums[0] == 1 && nums[n - 1] == n) {
            return 0;
        }

        int oneIndex = 0, lastIndex = 0;

        // Find positions of 1 and n
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                oneIndex = i;
            } else if (nums[i] == n) {
                lastIndex = i;
            }
        }

        // If 1 is before n, no overlap
        if (oneIndex <= lastIndex) {
            return oneIndex + (n - 1 - lastIndex);
        }

        // If 1 is after n, one swap overlaps
        return oneIndex + (n - 1 - lastIndex) - 1;
    }
}