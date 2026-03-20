class Solution {
    public int[] minDistinctFreqPair(int[] nums) 
    {
        int[] temp = new int[101];
        for(int i=0;i<nums.length;i++)
        {
            temp[nums[i]]++;
        }
        for(int i=0;i<101;i++)
        {
            if(temp[i]==0) continue;
            for(int j=i+1;j<101;j++)
            {
                if(temp[j]==0) continue;
                if(temp[i]!=temp[j]) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
//please upvote if you find helpful...
}