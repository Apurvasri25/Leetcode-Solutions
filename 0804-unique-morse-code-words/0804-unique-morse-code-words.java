class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
        "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
        ".--","-..-","-.--","--.."};

        HashSet<String> set = new HashSet<>();

        for(String word : words){
            StringBuilder str = new StringBuilder();
            for(char ch : word.toCharArray()){
                str.append(code[ch - 'a']);
            }
            set.add(str.toString());
        }
        return set.size();

    }
}