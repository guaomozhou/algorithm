package leetcode.generalPractice;

/**
 * @Author: mozhou
 * @Description: 最长公共前缀
 * @Date: 2021/7/15 21:45
 */
public class general0014 {
    public String longestCommonPrefix(String[] strs) {
        //边界条件判断
        if (strs == null || strs.length == 0)
            return "";
        //默认第一个字符串是他们的公共前缀
        String pre = strs[0];
        int i = 1;
        while (i < strs.length) {
            //不断的截取
            while (strs[i].indexOf(pre) != 0)
                pre = pre.substring(0, pre.length() - 1);
            i++;
        }
        return pre;
    }
    /*
    //第二种方法
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0||strs[0].isEmpty()){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        StringBuilder s = new StringBuilder();
        int x = 0;
        s.append(strs[0].charAt(x));
        boolean flag = true;
        while(flag){
        for (int i = 0; i < strs.length; ++i) {
            if(strs[i].length()<s.length()){
                s.deleteCharAt(s.length()-1);
                flag = false;
                break;
            }
            if (strs[i].substring(0, s.length()).contentEquals(s)) {
                flag = true;
            } else {
                s.deleteCharAt(s.length()-1);
                flag = false;
                break;
            }
        }
        if(strs[0].length()==s.length()) {
               break;
        }
        if(flag){
            s.append(strs[0].charAt(++x));
        }
        }
        return s.toString();
    }*/
}
