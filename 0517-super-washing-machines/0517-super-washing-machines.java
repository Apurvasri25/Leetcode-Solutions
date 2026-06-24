class Solution {
    public int findMinMoves(int[] machines) {
        int size=machines.length, sum=0;
        for(int i=0; i<size; i++)
            sum=sum+machines[i];

        if(sum%size!=0)
            return -1;

        int target=sum/size;           
        int currDiff, netSofar=0, move=0;
        for(int i=0; i<size; i++)         
        {
            currDiff=machines[i]-target; 
            netSofar+=currDiff;            

            if(Math.abs(netSofar)>move)
                move=Math.abs(netSofar);    
            if(currDiff>move)
                move=currDiff;
        }
        return move;
    }
}

