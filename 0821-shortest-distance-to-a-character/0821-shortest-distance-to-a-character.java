class Solution {
    public int[] shortestToChar(String s, char c) {
        int length = s.length();
        int[] result = new int[length];
      
        // Initialize a large value representing infinity
        final int INFINITY = 1 << 30;
        Arrays.fill(result, INFINITY);
      
        // First pass: left to right
        // Track the most recent occurrence of character c from the left
        int previousCharPosition = -INFINITY;
        for (int i = 0; i < length; i++) {
            // Update the position when we find character c
            if (s.charAt(i) == c) {
                previousCharPosition = i;
            }
            // Calculate distance from current position to the previous occurrence of c
            result[i] = Math.min(result[i], i - previousCharPosition);
        }
      
        // Second pass: right to left
        // Track the most recent occurrence of character c from the right
        int nextCharPosition = INFINITY;
        for (int i = length - 1; i >= 0; i--) {
            // Update the position when we find character c
            if (s.charAt(i) == c) {
                nextCharPosition = i;
            }
            // Calculate distance from current position to the next occurrence of c
            // Keep the minimum distance from both directions
            result[i] = Math.min(result[i], nextCharPosition - i);
        }
      
        return result;
    }
}
