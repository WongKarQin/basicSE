package LeetCode;

import java.util.Scanner;

//2022年7月28日11:43:57
//二分搜索 返回一个已排序的数组 特定数值的 索引
public class BinarySearch {
    //方法1非递归
//    public static int BinarySearch1(int[] arr,int target ){
//        int low = 0;
//        int up = arr.length-1;
//        while(low<=up){
//            int mid = (up-low)/2 + low;
//            if(arr[mid]==target){
//                return mid;
//            }else if(target <arr[mid]){
//                up = mid-1;
//            }else if(target > arr[mid]){
//                low = mid+1;
//            }
//        }
//        return -1;
//    }
    //方法2递归
    public static int BinarySearch2(int[] arr,int target,int low,int high) {
        if (low > high) return -1;
        int mid = (high-low)/2+low;
        if(target == arr[mid]) return mid;
        else if(target<arr[mid]) return BinarySearch2(arr,target,low,mid-1);
        else return BinarySearch2(arr,target,mid+1,high);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toString();
        String[] arrstr = str.split(",");
        int[] arr = new int[arrstr.length];
        for(int i =0;i<arr.length;i++){
            arr[i] = Integer.parseInt(arrstr[i]);
            System.out.print(arr[i]+" ");
        }
        int target = sc.nextInt();
        System.out.println(target);
        //int index = BinarySearch1(arr,target);
        int index = BinarySearch2(arr,target,0,arr.length-1);
        System.out.println("二分查找结果：");
        System.out.println(index);
    }
}
