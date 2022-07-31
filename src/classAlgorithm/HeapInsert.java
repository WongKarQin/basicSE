package classAlgorithm;

import java.util.Scanner;

//2022年7月31日14:58:21
//往堆中添加元素
//返回得到的新堆
//输入40
//25,20,9,10,17,4,5,3,7,11
//输出40 20 19 10 11 4 5 3 7 3 5
public class HeapInsert {
    public static int[] heapInsert(int[] arr,int i){
        arr = HeapSiftUp.sift_up(arr,i);
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int new_element = sc.nextInt();
        String str = sc.next();
        String[] arrstr = str.split(",");
        int[] arr = new int[arrstr.length+1];
        arr[arrstr.length]= new_element;
        for(int i =0;i<arrstr.length;i++){
            arr[i] = Integer.parseInt(arrstr[i]);
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] result = heapInsert(arr, arr.length);
        for(int i =0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
