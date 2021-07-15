package leetcode.generalPractice;

/**
 * @Author: mozhou
 * @Description: 字符串转换整数 (atoi)
 * @Date: 2021/7/15 21:38
 */
public class general0008 {
    public int myAtoi(String s) {
        //删除任何前导和尾随空格
        s = s.trim();
        //定义长度
        int length = s.length();
        //如果字符串为""直接返回0
        if (length == 0) {
            return 0;
        }
        //设置初始索引为0
        int index = 0;
        //设置返回值为0
        int result = 0;
        //设置符号，如果为1则为正，-1则为负
        int fuhao = 1;
        //判断首位是否为符号，如果是，则给符号赋对应值并且加索引加一（索引加一的目的就是为了跳过符号位）
        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            fuhao = s.charAt(index++) == '+' ? 1 : -1;
        }
        //循环String
        for (; index < length; index++) {
            //0的ascii码为48
            //定义一个临时数，为当前索引所对应的值-ascii码中的0。即如果对应的值为5，那么5的ascii码-0的ascii码得到对应的int值（即5）
            int temp = s.charAt(index) - '0';
            //对临时数进行判断，如果小于0或者大于9，则临时数不是0-9的数字，可能是特殊符号或者字母，读取中端，直接跳出循环
            if (temp < 0 || temp > 9) {
                break;
            }
            //如果为0-9的数字，则先进行越界判断
            //这里大家先看else中，返回值等于返回值*10+临时数
            //举个例子，比如124，第一次循环时，result为默认值0，进行到这里时，返回值result为0*10+1=1.
            //第二次循环时，result为1，temp临时数为2，返回值则等于1*10+2=12
            //第三次循环，result=12,temp=4，那么最后值为12*10+4=124;
            //说到了这个公式，便说道了越界问题，在进行返回值增加时要先考虑加入后会不会越界
            //假如我们自己设定一个最大值为1230,result返回值为124，如果我们将返回值*10，那么结果为1240.很明显会抛出越界异常，因为我们设定了最大值为1230
            //怎么判断越界呢，我们目前的返回值为124，我们将最大值除以10,1230/10=123;然后我们将返回值与最大值/10比较，124>123,返回值如果增加，必然越界
            //也有一种情况，返回值为123，最大值设置为1234.当我们将最大值/10与返回值比较时，123和123.4差距并不大
            // 如果临时值为0，123*10+0=1230，不会越界,。如果初始值为5，123*10+5=1235，那么必然越界，所以我们这两种情况进行判断
            //所以当返回值与最大值/10相等时，可能越界也可能不会，我们需要对临时值与最大值的最后一位比较，如果临时值大于最大值的最后一位则越界，否则不越界。
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && temp > Integer.MAX_VALUE % 10)) {
                //如果越界，这里我们对符号值进行判断，如果为负数则返回负数临界值，如果为正数则返回正临界值
                return fuhao == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            else {
                //如果不越界，则增加
                result = result * 10 + temp;
            }
        }
        //最后返回符号位*返回值。如果为负数，返回值*-1必然为负。
        return fuhao * result;
    }
}
