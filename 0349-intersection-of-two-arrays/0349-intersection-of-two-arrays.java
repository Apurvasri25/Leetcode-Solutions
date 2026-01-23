class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] flag = new boolean[1001];
        for (int i : nums1) flag[i] = true;
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;
        for (int j : nums2) {
            if (flag[j]) {
                temp[k++] = j;
                flag[j] = false;
            }
        }
        int[] ans = Arrays.copyOf(temp, k);
        return ans;
    }
}