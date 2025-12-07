class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String ans = "";

        for (String w : words) {
            ans += new StringBuilder(w).reverse() + " ";
        }

        return ans.trim();
    }
}
