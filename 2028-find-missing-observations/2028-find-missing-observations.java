class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int totalSum = mean * (m + n);

        int currentSum = 0;
        for (int r : rolls) {
            currentSum += r;
        }

        int missingSum = totalSum - currentSum;

        // Check validity
        if (missingSum < n || missingSum > 6 * n) {
            return new int[0];
        }

        int[] result = new int[n];
        int base = missingSum / n;
        int extra = missingSum % n;

        for (int i = 0; i < n; i++) {
            result[i] = base + (extra > 0 ? 1 : 0);
            if (extra > 0) extra--;
        }

        return result;
    }
}
