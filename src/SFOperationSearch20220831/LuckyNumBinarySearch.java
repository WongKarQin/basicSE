package SFOperationSearch20220831;


import java.util.Scanner;

public class LuckyNumBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long num = sc.nextLong();
        Long left = num/10 *10 +10;
        if(num%10==0){
            left=num/10 *10 +5;
        }
        Long right = 5L;
        while(num!=0){
            num=num/10;
            right = right*10+5;
        }
        Long res = BinarySearch(left,right);
        System.out.println(res);
    }
    private static Long BinarySearch(Long left, Long right){
        Long mid=0L;
        Long tmp=0L;
        while(left<=right){
            mid = (right+left)>>1;
            if(LuckyNum(mid)){
                tmp = mid;
            }
            right=mid-1;
        }
        return tmp;
    }
    private static boolean LuckyNum(Long mid){
        int res=0;
        while(mid>=5){
            if(mid%10==5) res++;
            mid=mid/10;
        }
        boolean flag=false;
        if(res>=5) flag=true;
        return flag;
    }
}
