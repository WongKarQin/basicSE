package DiDi20220904;

import java.util.Scanner;

//2022年9月4日20:03:03
public class PrettyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//n次轮询
        int[] l = new int[n];//左边界
        int[] r = new int[n];//右边界
        int[] t = new int[n];//异或运算目标
        for(int i=0;i<n;i++){
            l[i] = sc.nextInt();//左边界
        }
        for(int i=0;i<n;i++){
            r[i] = sc.nextInt();//左边界
        }
        for(int i=0;i<n;i++){
            t[i] = sc.nextInt();//左边界
        }
        int lNum,rNUm,tNum,res;
        for(int i=0;i<n;i++){
            lNum = l[i];
            rNUm = r[i];
            tNum = t[i];
            res = 0;
            for(int j=lNum;j<=rNUm;j++){
                if(tNum==prettyCnt(j)) res++;
            }
            System.out.print(res+" ");
        }
    }
    public static int prettyCnt(int num){
        if(num<10) return num;
        int res = num%10;
        num=num/10;
        while(num!=0){
            res=res^(num%10);
            num=num/10;
        }
        return res;
    }
}
