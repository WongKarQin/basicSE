package classAlgorithm;

import java.util.Scanner;

//2022-7-31 16:41:24
//堆排序
//输入n个元素的数字A[1...n]
//输出以非降序排序的数组A
//输入：4,5,3,7,5,17,19,10,11,20
//输出：5 11 19 10 5 17 3 4 7 20
public class HeapSort {
    public static int[] heapSort(int[] arr){
        int[] nums = MakeHeap.makeHeap(arr,arr.length);
        for(int i = nums.length;i>=2;i--){
            int temp = nums[i-1];
            nums[i-1] = nums[0];
            nums[0] = temp;
            int[] tempNums = new int[i];
            //关键点.
            //伪代码 SIFT_DOWN(A[1...j-1],1)
            System.arraycopy(nums,0,tempNums,0,i-1);
            int[] tempNums2 = HeapSiftDown.sift_down(tempNums,1);
            System.arraycopy(tempNums2,0,nums,0,i-1);
        }
        return nums;
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
        heapSort(arr);
        System.out.println();
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
