package leetcode.generalPractice;

/**
 * @Author: mozhou
 * @Description: 移除元素
 * @Date: 2021/7/15 21:36
 */
public class general0027 {
    public int removeElement(int[] nums, int val) {
        int abs = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != val){
                nums[abs++] = nums[i];
            }
        }
        return abs;
    }
}
