package basicSE;
//2022-8-3 23:19:40
//水仙花数判断
//春天是鲜花的季节，水仙花就是其中最迷人的代表，
// 数学上有个水仙花数，他是这样定义的： “水仙花数”是指一个三位数，它的各位数字的立方和等于其本身，
// 比如：153=1^3+5^3+3^3。 现在要求输出所有在m和n范围内的水仙花数。
import java.util.*;
class Narcissus{
    public static boolean narcissusNum(int num){
        int sum=0;
        int temp =num;
        while(temp!=0){
            sum+=Math.pow(temp%10,3);
            temp/=10;
        }
        return num==sum;
    }
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        while(cin.hasNextLine()){
            boolean flag = false;
            int m = cin.nextInt();
            int n = cin.nextInt();
            if(m>n){
                System.out.println("no");
            }
            for(int i =m;i<=n;i++){
                if(narcissusNum(i)){
                    System.out.print(i+" ");
                    flag = true;
                }
            }
            if(!flag){
                System.out.println("no");
            }
        }
    }
}