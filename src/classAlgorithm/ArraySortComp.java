package classAlgorithm;

import java.util.Arrays;
//2022年9月11日19:37:16
//搞懂排序比较器传入参数
public class ArraySortComp {
    public static void main(String[] args) {
        Integer[] a = {-1, 2, 3,0};
        Arrays.sort(a, (i, j) -> (Math.abs(j) - Math.abs(i))); //排序后，a为3 2 -1 0
        //i=2 j=-1;i=3,j=2
        //+号没用
        //置换 i 与 j 降序与升序。i后-j前为升序 j-i为降序
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
