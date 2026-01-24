class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        int l=0;
        int r=0;
        while(r<nums.length){
            if(!set.contains(nums[r])){
                set.add(nums[r]);
                r++;
            }else if(nums[r] == nums[l] && Math.abs(l-r)<=k){
                return true;
           
            }else{
                set.remove(nums[l]);
                l++;
            }                
            
        }
        return false;
}}