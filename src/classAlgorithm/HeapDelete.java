package classAlgorithm;

import java.util.Scanner;

//2022年7月31日15:30:52
//非空堆的元素按索引删除
//删除后仍为堆
//输入：index: 2
// 20,17,19,10,11,4,5,3,7,5
//输出：20 11 19 10 5 4 5 3 7
public class HeapDelete {
    public static int[] delete(int[] nums,int index){
        int num_to_delete = nums[index-1],num_tail = nums[nums.length-1];
        int len_newNums = nums.length-1;
        int[] newNums = new int[len_newNums];
        for(int i =0;i<len_newNums;i++){
            newNums[i]=nums[i];
        }
        if (index==len_newNums+1){//如果要删除的元素在末尾
            return newNums;
        }
        newNums[index-1] = num_tail;
        if(num_tail>=num_to_delete){//大的末尾数num_tail往上移动
            nums = HeapSiftUp.sift_up(newNums,index);
        }else{
            nums = HeapSiftDown.sift_down(newNums,index);
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        String str = sc.next();
        String[] arrstr = str.split(",");
        int[] arr = new int[arrstr.length];
        for(int i =0;i< arr.length;i++){
            arr[i] = Integer.parseInt(arrstr[i]);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] result = delete(arr,index);
        for(int i =0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}