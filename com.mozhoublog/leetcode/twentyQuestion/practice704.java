package leetcode.twentyQuestion;

/**
 *  二分查找
 * @Author mozhou
 */
public class practice704 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int mid;
        for(int i = 0;i<nums.length/2+1;i++){
            mid = (left+right)/2;
            if(target>nums[mid]){
                left = mid;
            }else if(target<nums[mid]){
                right = mid;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
