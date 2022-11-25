package TongHuaShunNLP20220905;

import java.util.Scanner;

//2022年9月5日15:14:32
public class GuPiaoSell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i=0;i<n;i++){
            prices[i]= sc.nextInt();
        }
        for(int i=n-1;i>0;i--){
            prices[i]=prices[i]-prices[i-1];
        }
        prices[0]=0;
        int res=0;
        for(int i=0;i<n;i++){
            if(prices[i]>0) res+=prices[i];
        }
        System.out.println(res);
    }
}
