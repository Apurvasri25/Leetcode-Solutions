class Solution {
    public int findChampion(int[][] grid) {
        int index=0;
        int ans=0;
        int max=Integer.MIN_VALUE;
        for(int arr[]:grid){
            int onescount=0;
            for(int i:arr){
               if(i==1){
                onescount++;
               }
            }
            if(onescount>max){
                max=onescount;
                ans=index;
            }
            index++;
        }
        return ans;
    }
}