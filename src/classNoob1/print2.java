package classNoob1;
//算法入门题目，整数32进制打印
//2022年7月22日23:50:27
//1<<i将000000000000000000001左移i位，<<为左移
//&与运算，1左移31位从0到31与num进行与运算，恰好得到num的第32位数字。
public class print2 {

    public static void print(int num){
        for(int i =31;i>=0;i--){
            System.out.print((num & (1<<i))==0 ?"0":"1");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int num =2;
        print(num);
    }
}
