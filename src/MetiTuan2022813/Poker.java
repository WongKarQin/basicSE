package MetiTuan2022813;
//2022年8月13日16:51:25
import java.util.*;
public class Poker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrTop =new int[n];
        int[] arrOr =new int[n];
        for(int i=0;i<n;i++){
            arrTop[i] = sc.nextInt();
        }
        int[] dp = new int[n];//被淘汰的序号
//        dp[0] = 2;//如果(i+1)*2 <n 直接 =(i+1)*2
//        dp[1] = 4+1;//如果i+(i+1)*2 <n-i 直接 =i+
//        dp[i] =
    }
}
