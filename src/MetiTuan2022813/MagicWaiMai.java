package MetiTuan2022813;

import java.util.*;

public class MagicWaiMai {
    public static int main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//订单总数
        int t = sc.nextInt();//个人能力
        int[] arrTime =new int[n];
        int magic = 0;
        for(int i=0;i<n;i++){//输入所有订单截止时间，默认递增的
            arrTime[i] = sc.nextInt();
        }
        int cnt=1;
        for(int i=0;i<n;i++){
            if(arrTime[i]>=t*cnt){
                cnt++;
            }else{
                magic++;
            }
        }
        return magic;
    }
}
