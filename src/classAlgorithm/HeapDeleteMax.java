package classAlgorithm;
import java.util.Scanner;

//删除堆中的最大键值元素
//2022年7月31日16:12:46
//输入：20,17,19,10,11,4,5,3,7,5
//输出：19 17 5 10 11 4 5 3 7
public class HeapDeleteMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arrstr = str.split(",");
        int [] arr = new int[arrstr.length];
        for(int i =0;i<arr.length;i++){
            arr[i] = Integer.parseInt(arrstr[i]);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int [] new_nums = HeapDelete.delete(arr,1);
        for(int i =0;i<new_nums.length;i++){
            System.out.print(new_nums[i]+" ");
        }
    }
}
