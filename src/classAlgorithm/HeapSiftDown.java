package classAlgorithm;

import java.util.Scanner;

//2022年7月31日14:12:39
//堆上的运算：sift_down
/*
20,17,9,10,11,4,5,3,7,5
现在假定储存在第2个位置上的元素从17变成3
输入：20,3,9,10,11,4,5,3,7,5
为了保证堆的性质,sift-down后
输出：20,11,9,10,5,4,5,3,7,3
*/
public class HeapSiftDown {
    public static int[] sift_down(int[] nums,int i){
        boolean flag = false;
        if (2*i>nums.length) return new int[-1];
        do {
            i = 2*i;
            if((i+1<= nums.length) && nums[i]>nums[i-1]){
                i = i+1;
            }
            if(nums[i/2-1]<nums[i-1]){
                int temp = nums[i/2-1];
                nums[i/2-1] = nums[i-1];
                nums[i-1] = temp;
            }else{
                flag = true;
            }
        }while(2*i<= nums.length && !flag);
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arrstr = str.split(",");
        int[] arr = new int[arrstr.length];
        for(int i =0;i< arr.length;i++){
            arr[i] = Integer.parseInt(arrstr[i]);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] result = sift_down(arr,2);
        for(int i =0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
