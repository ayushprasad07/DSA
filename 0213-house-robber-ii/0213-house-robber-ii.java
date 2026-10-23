class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int temp1[] = new int[n-1];
        int temp2[] = new int[n-1];
        for(int i = 0;i<n;i++){
            if (i !=0 ) temp1[i-1] = nums[i];
            if(i!=n-1) temp2[i] = nums[i];
        }

        int dp1[] = new int[n-1];
        int dp2[] = new int[n-1];

        for(int i = 0;i<n-1;i++){
            dp1[i] = -1;
            dp2[i] = -1;
        }

        int ans1 = solve(temp1.length-1,dp1,temp1);
        int ans2 = solve(temp2.length-1,dp2,temp2);

        int max = Math.max(ans1,ans2);

        return max;
    }

    public int solve(int idx,int dp[],int arr[]){
        if(idx==0) return arr[idx];
        if(idx<0) return 0;
        if(dp[idx] !=-1) return dp[idx];
        int pick = arr[idx] + solve(idx-2,dp,arr);
        int no_pick = 0 + solve(idx-1,dp,arr);
        dp[idx] = Math.max(pick,no_pick);
        return dp[idx];
    }
}