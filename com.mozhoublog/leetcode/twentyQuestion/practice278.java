package leetcode.twentyQuestion;

/**
 * @Author: mozhou
 * @Description: 第一个错误的版本
 * @Date: 2021/7/15 16:31
 */

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class practice278 {
    //看着报错不舒服，所以自己设置一个假的屏蔽报错
    public boolean isBadVersion(int version){
        return false;
    }
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while(left<right){
            int mid = left  + (right-left)/2;
            if(isBadVersion(mid)){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
}
