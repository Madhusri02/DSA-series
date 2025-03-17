class Solution {
    public int min(int i , int cost[] , int dp[]){
        if(i<0) return 0;
        if(i==0){
            // cur =Math.max(cur , cur+cost[0]);
            return cost[0];
        }

        if(dp[i]!=-2) return dp[i];

        int lr = min(i-1 ,cost , dp) ;

        int rr  = min(i-2 , cost ,dp);

        return dp[i] = cost[i] + Math.min(lr , rr);

    }
    public int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[cost.length];
        Arrays.fill(dp,-2);
        int cur = 0;
        int n = cost.length;
        return Math.min(min(n-1,cost,dp ) , min(n-2,cost,dp ));  
        
    }
}