package SFOperationSearch20220831;

import java.util.Scanner;

public class NumGuessBad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =(1+num-1) *(num-1)/2;
        System.out.println(sum+1);
    }
}
