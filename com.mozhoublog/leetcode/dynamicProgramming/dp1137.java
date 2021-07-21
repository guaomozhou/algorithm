package leetcode.dynamicProgramming;

/**
 * @Author: mozhou
 * @Description: 第 N 个泰波那契数
 * @Date: 2021/7/21 16:34
 */
public class dp1137 {
    public int tribonacci(int n) {
        if(n==0||n==1){
            return n;
        }
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
}
