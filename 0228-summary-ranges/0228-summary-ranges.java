class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        if(nums.length==0){
            return list;
        }
        int start = 0;
        for(int i = 0;i<nums.length;i++){
            if(i+1<nums.length && nums[i+1]-1 != nums[i]){
                if(start==i){
                    list.add(String.valueOf(nums[i]));
                    start=i+1;
                    continue;
                }
                list.add(nums[start]+"->"+nums[i]);
                start=i+1;
                continue;
            }
            if(i==nums.length-1){
                if(start==nums.length-1){
                    list.add(String.valueOf(nums[start]));
                }else{
                    list.add(nums[start]+"->"+nums[nums.length-1]);
                }                    
            }
        }
        return list;
    }
}