package leetcode.generalPractice;

/**
 * @Author: mozhou
 * @Description: 罗马数字转整数
 * @Date: 2021/7/15 21:44
 */
public class general0013 {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i!=(s.length()-1)&&(match(s,i)<match(s,i+1))){
                result =  match(s,i+1)-match(s,i) + result;
                i++;
            }else{
                result +=match(s,i);
            }
        }
        return result;
    }
    public int match(String s,int i){
        switch (s.charAt(i)){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return -1;
    }
}
