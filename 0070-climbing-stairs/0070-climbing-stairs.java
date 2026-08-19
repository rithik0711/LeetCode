class Solution {
    public int Climbing(int n, int[] dp, int ind){
        if(ind>n){
            return dp[n];
        }
        dp[ind]=dp[ind-1]+dp[ind-2];
        return Climbing(n, dp, ind+1);
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+2];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        return Climbing(n, dp, 3);
    }
}