package leetcode.twentyQuestion;

/**
 * @Author: mozhou
 * @Description: 搜索插入位置
 * @Date: 2021/7/15 16:35
 */
public class practice35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while(left<right){
            int mid = left + (right-left)/2;
            if(nums[mid] > target){
                if(right==mid){
                    return mid+1;
                }
                right = mid;
            }else if(nums[mid] < target){
                if(left==mid){
                    return mid+1;
                }
                left = mid;
            }else{
                return mid;
            }
        }
        return left;
    }
}
