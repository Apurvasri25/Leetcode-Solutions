class Solution {
    public int pivotIndex(int[] nums) {
         int sum=0;
      for (int i = 0; i < nums.length; i++) sum+=nums[i];
      int rum=0;
      for(int i=0;i<nums.length;i++)
      {
          rum+=nums[i];
          if(sum-rum==rum-nums[i])
              return i;
      }

    return -1;
    }
}