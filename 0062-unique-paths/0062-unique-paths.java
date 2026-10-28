class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j = 0;j<=n;j++){
                dp[i][j] = -1;
            }
        }

        int paths = solve(m-1,n-1,dp);

        return paths;
    }

    public int solve(int i,int j,int dp[][]){
        int up;
        int left;
        if(i==0 & j==0){
            return 1;
        }

        if(i<0 || j<0){
            return 0;
        }

        if(dp[i][j]!=-1) return dp[i][j];

        up = solve(i-1,j,dp);
        left = solve(i,j-1,dp);
        dp[i][j] = up+left;
        return dp[i][j];
    }
}