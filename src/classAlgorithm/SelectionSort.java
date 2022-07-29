package classAlgorithm;

import java.util.Scanner;

//2022年7月29日14:11:41
//选择排序
//A[1...n]共n个元素
//首先找到最小元素，将其存放在A[1]
//然后找到剩下的n-1个元素中的最小元素
//将其存放在A[2]中
//重复此过程直到找到第二大的元素，并将其存放在A[n-1]中。
public class SelectionSort {
    public static int[] SelectionSort(int[] arr){
        for(int i =1;i< arr.length;i++){
            int k =i;
            for(int j =i+1;j<=arr.length;j++){
                if (arr[j-1]<arr[k-1]){
                    k=j;
                }
            }
            if (k!=i){
                int temp = arr[k-1];
                arr[k-1] = arr[i-1];
                arr[i-1]=temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toString();
        String[] arrstr = str.split(",");
        int[] arr = new int[arrstr.length];
        for(int i =0;i<arr.length;i++){
            arr[i] = Integer.parseInt(arrstr[i]);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] arrSort = SelectionSort(arr);
        for(int i =0;i<arrSort.length;i++){
            System.out.print(arrSort[i]+" ");
        }
    }
}
