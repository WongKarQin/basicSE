package DiDi20220904;

import java.util.Scanner;
import java.util.Arrays;
//2022年9月4日20:00:52
public class PeachCnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//n个桃子
        int k = sc.nextInt();//k倍
        int[] weights = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            weights[i] = sc.nextInt();
            sum+=weights[i];
        }
        double avg = sum/n;
        int res = n;
        Arrays.sort(weights);
        int maxWeight = weights[n-1];
        while(maxWeight>k*avg && n>=0){
            res--;
            n--;
            sum-=maxWeight;
            maxWeight = weights[n-1];
            avg=sum/n;
        }
        System.out.println(res);
    }
}
