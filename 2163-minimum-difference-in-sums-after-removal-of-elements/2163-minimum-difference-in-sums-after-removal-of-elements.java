class Solution {
    public long minimumDifference(int[] nums) {
        int n = nums.length / 3;
        int len = nums.length;

        long[] left = new long[len];
        long[] right = new long[len];

        // Max heap for left minimum sum
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;

        for (int i = 0; i < len; i++) {
            maxHeap.add(nums[i]);
            sum += nums[i];

            if (maxHeap.size() > n) {
                sum -= maxHeap.poll();
            }
            left[i] = (maxHeap.size() == n) ? sum : Long.MAX_VALUE;
        }

        // Min heap for right maximum sum
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        sum = 0;

        for (int i = len - 1; i >= 0; i--) {
            minHeap.add(nums[i]);
            sum += nums[i];

            if (minHeap.size() > n) {
                sum -= minHeap.poll();
            }
            right[i] = (minHeap.size() == n) ? sum : Long.MIN_VALUE;
        }

        long ans = Long.MAX_VALUE;
        for (int i = n - 1; i < 2 * n; i++) {
            ans = Math.min(ans, left[i] - right[i + 1]);
        }

        return ans;
    }
}
