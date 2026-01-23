import java.util.*;
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
HashSet <Integer> set = new HashSet <>();
int count = 0;
for(int num : arr){
    set.add(num);
    if(num % 2 != 0){
        count ++;
    if(count == 3)
        return true;
    }
    else{
        count = 0;
    }
    
}
       return false;
    }
}