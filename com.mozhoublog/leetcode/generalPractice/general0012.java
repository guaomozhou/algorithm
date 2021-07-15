package leetcode.generalPractice;

/**
 * @Author: mozhou
 * @Description: 整数转罗马数字
 * @Date: 2021/7/15 21:41
 */
public class general0012 {
    public String intToRoman1(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length && num >= 0; i++) {
            while (values[i] <= num) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
    }
    /*
    //第二种方法
    public String intToRoman(int num) {
        StringBuilder s = new StringBuilder();
        if(num==0){
            return "";
        }
        if(num>=1&&num<5){
            if(num==4){
                s.append("IV");
            }else {
                for (int i = 0; i < num; i++) {
                    s.append("I");
                }
            }
        }else if(num>=5&&num<10){
            if(num == 9){
                s.append("IX");
            }else {
                s.append("V");
                for (int i = 0; i < num - 5; i++) {
                    s.append("I");
                }
            }
        }else if(num>=10&&num<50){
            if(num>=40){
                s.append("XL");
                num-=40;
            }
            for (int i = 0; i < num / 10; i++) {
                s.append("X");
            }
            s.append(intToRoman(num%10));
        }else if(num>=50&&num<100){
            if(num>=90){
                s.append("XC");
                num-=90;
            }else{
                s.append("L");
            }
            for (int i = 0; i < (num-50) / 10; i++) {
                s.append("X");
            }
            s.append(intToRoman(num%10));
        }else if(num>=100&&num<500){
            if(num>=400){
                s.append("CD");
                num-=400;
            }else{
                for (int i = 0; i < num / 100; i++) {
                    s.append("C");
                }
            }
            s.append(intToRoman(num%100));
        }else if(num>=500&&num<1000){
            if(num>=900){
                s.append("CM");
                num-=900;
            }else{
                s.append("D");
                for (int i = 0; i < (num-500) / 100; i++) {
                    s.append("C");
                }
            }
            s.append(intToRoman(num%100));
        }else{   //num大于1000
            for (int i = 0; i < num / 1000; i++) {
                s.append("M");
            }
            s.append(intToRoman(num%1000));
        }
        return s.toString();
    }*/
}
