class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int n) {
        int sum = 0;
        int temp = n;
        
        while (n > 0) {
            int r = n % 10;
            sum = sum + r;
            n = n / 10;
        }

        if(sum == 0){
            return -1;
        }

        if(temp % sum == 0){
        return sum;
        }

        return -1;
    }
}