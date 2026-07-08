import java.util.*;
class Solution {
    private int[][] dp;
    private int solve(String s, int i,int j){
        if(i>=j)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(s.charAt(i)==s.charAt(j))
            return dp[i][j] = solve(s,i+1,j-1);
        return dp[i][j] = 1+ Math.min(solve(s,i,j-1), solve(s,i+1,j));
    }
    public int minInsertions(String s) {
        int n = s.length();
        dp = new int[n][n];
        for(int i=0;i<n;i++)
        java.util.Arrays.fill(dp[i],-1);
        return solve(s,0,n-1);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "ab";
        int result = sol.minInsertions(s);
        System.out.println(result);
    }
}