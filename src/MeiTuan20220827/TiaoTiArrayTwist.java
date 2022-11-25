package MeiTuan20220827;

import java.util.Scanner;

public class TiaoTiArrayTwist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//数组从1到n,初始数组
        int m = sc.nextInt();//共twistm次
        int[] idxArr = new int[m];//每次的编号
        int[] Arr = new int[n];
        for(int i=0;i<m;i++){
            idxArr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            Arr[i]=i+1;
        }
        for(int item : idxArr){
            Arr = twistArr(Arr,0,item-1);
            Arr = twistArr(Arr,1,item-1);
        }
        for(int item:Arr){
            System.out.print(item+" ");
        }
    }
    private static int[] twistArr(int[] Arr, int start, int end){
        for(int i=start,j=end;i<j;i++,j--){
            int tmp = Arr[i];
            Arr[i]= Arr[j];
            Arr[j] =tmp;
        }
        return Arr;
    }
}
