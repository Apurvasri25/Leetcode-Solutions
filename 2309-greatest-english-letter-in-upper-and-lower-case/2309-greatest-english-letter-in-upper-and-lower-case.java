class Solution {
    public String greatestLetter(String s) {
        int n = s.length();
        
        boolean upp[] = new boolean[26];
        boolean low[] = new boolean[26];

        for(int i=0;i<n;i++){
            if(Character.isUpperCase(s.charAt(i))) upp[s.charAt(i) - 'A'] = true; 
            else    low[s.charAt(i) - 'a'] = true;            
        }

        int idx = -1;
        for(int i = 25;i>= 0;i--){
            if(upp[i] && low[i]) return String.valueOf((char) (i + 65));
        }

        return "";
    }
}

// TC :  O(n^)
/*
class Solution {
    public String greatestLetter(String s) {
        
        int n = s.length();
        String ans = "";

        for(int i =0;i<n;i++){
            for(int j = i;j<n;j++){
                if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j)) && s.charAt(i) != s.charAt(j)) {
        ans = (ans.length() == 0)? String.valueOf(Character.toUpperCase(s.charAt(i))): String.valueOf((char) Math.max(ans.charAt(0),Character.toUpperCase(s.charAt(i))));
                    break;
                }
            }
        }
        return ans;
    }
}
 */