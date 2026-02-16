class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;  // ugly numbers are positive
        
        int[] primes = {2, 3, 5};
        for (int p : primes) {
            while (n % p == 0) {
                n /= p;
            }
        }
        
        return n == 1; // only ugly if n reduced to 1
    }
}