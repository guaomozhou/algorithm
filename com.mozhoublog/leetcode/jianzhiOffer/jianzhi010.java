package leetcode.jianzhiOffer;

/**
 * @Author: mozhou
 * @Description: 青蛙跳台阶问题
 * @Date: 2021/7/15 21:14
 */
public class jianzhi010 {
    public int numWays(int n) {
       if(n == 0){
            return 1;
       }
       if(n == 1){
            return 1;
       }
       int a = 1,b = 1;
       int sum = a+b;
       return sum;
    }
}
