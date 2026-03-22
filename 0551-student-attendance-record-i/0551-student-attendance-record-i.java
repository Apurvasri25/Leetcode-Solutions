class Solution {
    public boolean checkRecord(String s) {
        int a=0;
        int y=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                a++;
            }
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='L' && s.charAt(i+1)=='L'){
                y++;
                System.out.println(i+""+(i+1)+""+y);
            }
            else if(y>=3){
                break;
            }
            else{
                y=1;
            }
        }
        if(a>=2 || y>=3){
            return false;
        }
        return true;
    }
}