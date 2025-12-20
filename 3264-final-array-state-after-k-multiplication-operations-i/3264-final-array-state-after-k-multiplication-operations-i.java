class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> {
                if (nums[a] != nums[b]) {
                    return nums[a] - nums[b]; // smaller value first
                }
                return a - b; // tie → smaller index first
            }
        );

        for (int i = 0; i < nums.length; i++) {
            pq.add(i);
        }

        while (k-- > 0) {
            int idx = pq.poll();
            nums[idx] *= multiplier;
            pq.add(idx);
        }

        return nums;
    }
}
