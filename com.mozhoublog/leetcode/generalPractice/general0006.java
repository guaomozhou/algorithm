package leetcode.generalPractice;

/**
 * @Author: mozhou
 * @Description: Z 字形变换
 * @Date: 2021/7/15 21:38
 */
public class general0006 {
    public String convert(String s, int numRows) {
        int line  = 2*(numRows-1);
        if(numRows==1||s.length()<numRows){
            return s;
        }
        StringBuffer s1  = new StringBuffer();
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length();j+=line) {
                if(i==0||i==numRows-1){
                    s1.append(s.charAt(j));
                }else {
                    s1.append(s.charAt(j));
                    if((j+line-2*i)<s.length()){
                        s1.append(s.charAt(j+line-2*i));
                    }
                }
            }
        }
        return s1.toString();
    }
}
