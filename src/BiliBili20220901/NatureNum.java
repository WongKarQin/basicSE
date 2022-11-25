package BiliBili20220901;

import java.util.Scanner;

public class NatureNum {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int res = 0;
        int n = sc.nextInt();
        if(isPrimer(n)){
            res = n;
        }else{
            int sum =Integer.MAX_VALUE;
            for(int i =2;i*i<=n;i++){
                if(n%i==0){
                    int tmpNum = i+n/i;
                    if(tmpNum<sum) sum=tmpNum;
                }
            }
            res = sum;
        }

        System.out.println(res);
    }
    private static boolean isPrimer(int n){
        boolean flag = true;
        for(int i =2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return flag;
    }
}
