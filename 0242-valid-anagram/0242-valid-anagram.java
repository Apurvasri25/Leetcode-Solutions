class Solution {
    /**
     * Determines if two strings are anagrams of each other.
     * Two strings are anagrams if they contain the same characters with the same frequencies.
     * 
     * @param s the first string to compare
     * @param t the second string to compare
     * @return true if the strings are anagrams, false otherwise
     */
    public boolean isAnagram(String s, String t) {
        // Early return if strings have different lengths - they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }
      
        // Array to track character frequency differences
        // Index represents character (0 for 'a', 1 for 'b', ..., 25 for 'z')
        int[] characterCount = new int[26];
      
        // Process both strings simultaneously
        // Increment count for characters in string s
        // Decrement count for characters in string t
        for (int i = 0; i < s.length(); i++) {
            characterCount[s.charAt(i) - 'a']++;
            characterCount[t.charAt(i) - 'a']--;
        }
      
        // Check if all character counts are zero
        // If any count is non-zero, the strings are not anagrams
        for (int i = 0; i < 26; i++) {
            if (characterCount[i] != 0) {
                return false;
            }
        }
      
        // All character counts are zero, strings are anagrams
        return true;
    }
}