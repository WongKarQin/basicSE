package classAlgorithm;

import java.util.Scanner;

//2022年7月28日15:49:15
//线性搜索
//输入：第一行第一个数组个数n1
//第二行数组arr1
//第三行第二个数组个数n2
//第四行数组arr2
//输出：同时在两数组出现数字的个数
public class LinearSearch {
    public static int LinearSearch(int[] arr1,int[] arr2){
        int result= 0;
        for(int i =0;i< arr1.length;i++){
            for(int j =0;j< arr2.length;j++){
                if(arr1[i]==arr2[j]) result++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int [n1];
        for (int i =0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int [n2];
        for (int i =0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int countSameNum = LinearSearch(arr1,arr2);
        System.out.println(countSameNum);
    }
}