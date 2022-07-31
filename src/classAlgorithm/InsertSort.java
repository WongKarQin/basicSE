package classAlgorithm;

import java.util.Scanner;

//2022年7月29日14:31:31
//基础排序算法：插入排序A[1...n]
//从大小为1的子数组A[1]开始。
//接下来是A[2]，插入到A[1]的前面或者后面
//接下来是A[3],插入到A[2]后面或A[1]与A[2]中间或者A[1]前面
//以此类推，直到A[n]被插入到合适位置。
public class InsertSort {
    public static int[] InsertSort(int[] arr){
        for(int i =2;i<= arr.length;i++){
            int temp = arr[i-1];//temp为待插入的元素
            int j = i-1;//待插入元素前的元素索引
            while(j>0&&arr[j-1]>temp){//有比temp大的元素就将temp位置换成该元素
                arr[j]=arr[j-1];
                j = j-1;
            }
            arr[j]=temp;//temp插入到合适位置
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
        int[] arrSort = InsertSort(arr);
        for(int i =0;i<arrSort.length;i++){
            System.out.print(arrSort[i]+" ");
        }
    }
}
