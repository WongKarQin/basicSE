package classNoob1;
//2022年7月23日14:30:33
//交换2个数字的值
//法1中间量，倒饮料
//法2加减，简单的逻辑运算
public class exchange2NumValue {
    public static void swap_1(int a, int b){
        System.out.println("这是交换方法1,"+"a:"+a+"\tb:"+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("方法1交换后,"+"a:"+a+"\tb:"+b);
    }
    public static void swap_2(int a, int b){
        System.out.println("这是交换方法2,"+"a:"+a+"\tb:"+b);
        a = a+b;//b的值仍为b
        b = a-b;//b的值为a
        a = a-b;//a的值为b
        System.out.println("方法2交换后,"+"a:"+a+"\tb:"+b);
    }
    public static void main(String[] args){
        int a = 2;
        int b = 5;
        swap_1(a,b);
        swap_2(a,b);
    }
}
