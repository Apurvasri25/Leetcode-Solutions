class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) 
    {
        boolean[] hash = new boolean[101];
        for(int i=0;i<bulbs.size();i++)
        {
            if(hash[bulbs.get(i)]==false)
            {
                hash[bulbs.get(i)]=true;
            }
            else
            {
                hash[bulbs.get(i)]=false;
            }
        }
        List<Integer> arr = new ArrayList<>();
        for(int i=1;i<101;i++)
        {
            if(hash[i]==true)
            {
                arr.add(i);
            }
        } 
        
        return arr;
    }
//please upvote...
}