package classAlgorithm;
import java.util.Scanner;
//2022年7月31日11:49:55
//算法设计技巧与分析 沙特M.H.Alsuwaiyel
//堆上的运算：sift-up
/*
20,17,9,10,11,4,5,3,7,5
现在假定储存在第10个位置上的元素从5变成25
输入：20,17,9,10,11,4,5,3,7,25
为了保证堆的性质,sift-up后
输出：25,20,9,10,17,4,5,3,7,11
*/
public class HeapSiftUp {
    public static int[] sift_up(int[] heap,int index){
        boolean done = false;
        if (index ==1) return heap;
        do{
            if(heap[index-1]>heap[index/2-1]){
                int temp = heap[index-1];
                heap[index-1]= heap[index/2-1];
                heap[index/2-1]=temp;
            }else{
                done =true;
            }
            index = index/2;
        }while(index!=1 && !done);
        return heap;
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
        int[] result = sift_up(arr,10);
        for(int i =0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}