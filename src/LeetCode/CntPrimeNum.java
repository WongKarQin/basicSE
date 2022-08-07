package LeetCode;
//2022年8月7日18:10:05
//LeetCode204
public class CntPrimeNum {
    public class Solution {
        public int countPrimes(int n) {
            //boolean默认是false
            boolean[] arr = new boolean[n];
            int count = 0;
            //以下为 “埃拉托斯特尼” 筛选法
            for(int i = 2; i < n; i++) {
                System.out.println(arr[i]);
                if(arr[i])
                    continue;
                //为false累加
                count++;
                //for为了素数翻倍(变成合数)，合数翻倍还是合数，剩下的就真素数
                for(int j = i;j < n;j=i+j){
                    //把合数赋为true
                    arr[j] = true;
                }
            }
            return count;
        }
    }
}
