class Solution {
    public int integerBreak(int n) {
        return helper(n-1, n);
        
    }
    int helper(int n, int total)
    {
        if(n <= 1)
        return 1;
        int notpick = helper(n-1, total);
        int pick = 0;
        if(total >= n)
        pick = n * helper(n, total - n);

        return Math.max(pick, notpick);
    }
}
