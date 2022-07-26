package basicSE;

import java.util.Scanner;

//2022年7月26日14:27:52
//Scanner输入两数并打印，打印两数之和
public class TwoNumSumScanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = num1+num2;
        System.out.println(num1 +" " +num2);
        System.out.println(result);
    }
}
