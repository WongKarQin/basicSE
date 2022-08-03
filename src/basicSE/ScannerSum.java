package basicSE;
import java.util.*;
/*输入数据有多组，每组占一行，由两个整数n（n<10000）和m(m<1000)组成，n和m的含义如前所述。
对于每组输入数据，输出该数列的和，每个测试实例占一行，要求精度保留2位小数。
 */
public class ScannerSum {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        while(cin.hasNextLine()) {
            double m = cin.nextDouble();
            int n = cin.nextInt();
            double sum =m;
            for(int i =1;i<n;i++){
                sum+=Math.sqrt(m);
                m = Math.sqrt(m);
            }
            System.out.println(String.format("%.2f", sum));
        }
    }

}
