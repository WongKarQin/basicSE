package meiTuan20220806;
import java.util.Scanner;
public class isValidIndex {
    public static int returnRes(int[] arr,int len,int mark){
        int res = 0;
        for(int i =0;i<len;i++){
            if(i<mark && arr[i]>=0){
                res++;
            }else if(i>mark+1 &&arr[i]<=0){
                res++;
            }
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i =0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        int res = len;
        int[] arrMark =new int[len];
        int cnt = 0;
        for(int i =0;i<len-1;i++){
            if(arr[i]<0 && arr[i+1]>0){
                arrMark[cnt] = i;
                cnt++;
            }
        }
        for(int i =0;i<cnt;i++) {
            int newRes = returnRes(arr,len,arrMark[i]);
            res = res < newRes ? res : newRes;
        }
        System.out.println(res);
    }

}
