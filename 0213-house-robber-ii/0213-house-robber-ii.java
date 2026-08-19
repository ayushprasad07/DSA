class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);

        return Math.max(helper(1,n-1,n,nums),helper(0,n-2,n,nums));
    }

    public static int helper(int start,int end,int n,int nums[]){
        int dp[] = new int[n-1];

        dp[0] = nums[start];
        dp[1] = Math.max(nums[start],nums[start+1]);

        for(int i = start+2;i<=end;i++){
            dp[i-start] = Math.max(dp[i-start-1], dp[i-start-2]+nums[i]);
        }

        return dp[n-2];
    }
}