package classAlgorithm;

import java.util.Scanner;

//2022年7月31日16:24:57
//创建堆
//输入n个元素的数组A[1...n]。
//输出A[1...n]转换成堆。
//输入：4,5,3,7,5,17,19,10,11,20
//输出：20 11 19 10 5 17 3 4 7 5
public class MakeHeap {
    public static int[] makeHeap(int[]arr, int arrLen ){
        for(int i=arr.length/2;i>=1;i--){
            HeapSiftDown.sift_down(arr,i);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arrstr = str.split(",");
        int[] arr = new int[arrstr.length];
        for(int i =0;i<arr.length;i++){
            arr[i] = Integer.parseInt(arrstr[i]);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        makeHeap(arr,arr.length);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
