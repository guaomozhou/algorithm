package leetcode.generalPractice;

/**
 * @Author: mozhou
 * @Description: 回文数
 * @Date: 2021/7/15 21:36
 */
public class general0009 {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        StringBuffer s = new StringBuffer();
        s.append(x);
        int j = 0;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)!=s.charAt(j++)){
                return false;
            }
        }
        return true;
    }
}
