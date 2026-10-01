class Solution {
    public boolean isValid(String s) {

        int n = s.length();

        if (n % 2 != 0) {
            return false;
        }

        char[] stack = new char[n];
        int j = 0;

        for (int i = 0; i < n; i++) {

            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack[j++] = c;
            }
            else {
                if (j == 0) {
                    return false;
                }

                j--;

                if (c == ')' && stack[j] != '(') {
                    return false;
                }

                if (c == ']' && stack[j] != '[') {
                    return false;
                }

                if (c == '}' && stack[j] != '{') {
                    return false;
                }
            }
        }

        return j == 0;
    }
}