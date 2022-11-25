package MetiTuan2022813;

import java.util.*;

public class MagicWaiMai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//订单总数
        int t = sc.nextInt();//每单消耗时间
        int[] arrTime = new int[n];
        int magic = 0;
        for (int i = 0; i < n; i++) {//输入所有订单截止时间，默认递增的
            arrTime[i] = sc.nextInt();
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arrTime[i] - cnt * t < t) {
                magic++;
            }else{
                cnt++;
            }

        }
        System.out.println(magic);
    }
}
