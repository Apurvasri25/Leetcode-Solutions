class Solution {
    public int maxDistToClosest(int[] seats) {
        int n = seats.length;
        int[] left = new int[n];
        int[] right = new int[n];

        // Fill left distances
        int dist = n; // large number
        for (int i = 0; i < n; i++) {
            if (seats[i] == 1) {
                dist = 0;
            } else {
                dist++;
            }
            left[i] = dist;
        }

        // Fill right distances
        dist = n;
        for (int i = n - 1; i >= 0; i--) {
            if (seats[i] == 1) {
                dist = 0;
            } else {
                dist++;
            }
            right[i] = dist;
        }

        // Find max of min distances
        int maxDist = 0;
        for (int i = 0; i < n; i++) {
            if (seats[i] == 0) {
                int minDist = Math.min(left[i], right[i]);
                maxDist = Math.max(maxDist, minDist);
            }
        }

        return maxDist;
    }
}
