package leetcode.jianzhiOffer;

/**
 * @Author: mozhou
 * @Description: 替换空格
 * @Date: 2021/7/15 21:12
 */
public class jianzhi005 {
    public String replaceSpace(String s) {
        StringBuffer s1 = new StringBuffer();
        char c;
        for(int i = 0;i<s.length();i++){
            c = s.charAt(i);
            if(c ==  ' '){
                s1.append("%20");
            }else{
                s1.append(c);
            }
        }
        System.out.println(s1.toString());
        return s1.toString();
    }
}
