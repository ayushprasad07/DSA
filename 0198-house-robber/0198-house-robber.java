class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        int dp[] = new int[n];

        for(int i = 0;i<n;i++){
            dp[i] = -1;
        }

        int max = solve(n-1,dp,nums);

        return max;
    }

    public int solve(int idx, int dp[],int arr[]){
        if(idx==0){
            return arr[idx];
        }
        if(idx<0) return 0;

        if(dp[idx]!=-1) return dp[idx];

        int pick = arr[idx] + solve(idx-2,dp,arr);
        int non_pick = 0 + solve(idx-1,dp,arr);

        dp[idx] = Math.max(pick,non_pick);

        return dp[idx];
    }
}