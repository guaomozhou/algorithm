package leetcode.dynamicProgramming;

/**
 * @Author: mozhou
 * @Description: 斐波那契数-dp
 * @Date: 2021/7/21 16:28
 */
public class dp0509 {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        //设置一个Dp数组
        int dp[] = new int[n+1];
        //指定dp[0]为0,dp[1]为1
        dp[0] = 0;
        dp[1] = 1;
        //遍历，第n个数的值为前两项之和
        for (int i = 2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
