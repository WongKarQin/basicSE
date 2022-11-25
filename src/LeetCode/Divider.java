package LeetCode;
//2022年8月18日17:44:05
//LeetCode29
//将两数相除，要求不使用乘法、除法和 mod 运算符。
//顺便实现加法器，减法器，乘法器
public class Divider {
    //加法器
    private static int add(int a, int b){//加法实现位运算两正数
        if(b==0) return a;
        return (add(a^b,(a&b)<<1));//异或 按位与
    }
    //减法器
    private static int minus(int a, int b){//~b = -(b+1)
        return add(a,add(~b,1));
    }
    //乘法器
    private static int mutiply(int a, int b){
        int a1 = a>0?a:add(~a,1);
        int b1 = b>0?b:add(~b,1);
        int res=0;
        while(b1!=0){
            if((b1&1)!=0){
                res = add(res,a1);
            }
            a1<<=1;
            b1>>=1;
        }
        return (a^b)<0?add(~res,1):res;
    }
    //除法器
//    public static int divide(int a,int b){
//        //实现除法，从理论上也很简单，就是不断的减去除数看能减几次，但是每次只减一次效率太低！，所以用倍数
//            if(a==0||b==0)
//                return 0;
//            //判断符号，一旦相异或后小于零说明两个符号位不同
//            boolean sign = (a^b)<0;
//            //处理取正数的特殊情况，因为如果INT_MIN取正数计算会爆
//            if(b==Integer.MIN_VALUE)
//                return a==Integer.MIN_VALUE?1:0;
//            //用无符号型以便能正确的计算INT_MIN的情形
//            long x,y;
//            //同样处理a的特殊情况
//            if(a==Integer.MIN_VALUE){
//                if(b==1)
//                    return Integer.MIN_VALUE;
//                if(b==-1)
//                    return Integer.MAX_VALUE;
//                x = (int) a;
//                y = b>=0?b:~(b-1);
//            }else{
//                x = a>=0?a:~(a-1);
//                y = b>=0?b:~(b-1);}
//            if(x<y)
//                return 0;
//            int res = 0;
//            for (int i = 31; i >= 0; i--) {
//                //如果x/2^i大于y，则y*2^i小于x，所以可以直接加上2^i这个倍数，然后把x-y*倍数
//                //左移相当于除以2^i,右移相当于乘以2^i
//                if ((x >> i) >= y) {
//                    res = add(res,1<<i);
//                    x = add(x,~(y<<i)+1);
//                }
//            }//根据符号取得最后的结果，如果符号为负号就取反码得到负数
//            res = sign?(~res)+1:res;
//            return res;
//        }
    public static void main(String[] args) {
        int sum = add(1,2);
        System.out.println(sum);
        int muti = mutiply(2,5);
        System.out.println(muti);
    }
}
