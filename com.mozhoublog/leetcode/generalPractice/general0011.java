package leetcode.generalPractice;

/**
 * @Author: mozhou
 * @Description: 盛最多水的容器
 * @Date: 2021/7/15 21:19
 */
public class general0011 {
    public int maxArea(int[] height) {
        int a = 0,l = height.length-1;
        int result = 0;
        while(a<l){
            if(result<Math.min(height[a],height[l])*(l-a)){
                result = Math.min(height[a],height[l])*(l-a);
            }
            if(height[a]>height[l]){
                --l;
            }else{
                ++a;
            }
        }
        return result;
    }
}
