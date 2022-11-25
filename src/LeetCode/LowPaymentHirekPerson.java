package LeetCode;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

//2022年9月11日14:50:51
//857
//https://leetcode.cn/problems/minimum-cost-to-hire-k-workers/solution/yi-bu-bu-ti-shi-ru-he-si-kao-ci-ti-by-en-1p00/
public class LowPaymentHirekPerson {
    public static void main(String[] args) {
        int [] qua = new int[]{10,20,5};
        int [] wage = new int[]{70,50,30};
        int k = 2;
        Solution sl = new Solution();
        System.out.println(sl.mincostToHireWorkers(qua,wage,k));
    }
}
class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length, sumQ = 0;
        Integer[] id = IntStream.range(0, n).boxed().toArray(Integer[]::new);
        Arrays.sort(id, (i, j) -> wage[i] * quality[j] - wage[j] * quality[i]); // 按照 r 值排序,升序 i后-j前
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a); // 最大堆
        for (int i = 0; i < k; ++i) {
            pq.offer(quality[id[i]]);
            sumQ += quality[id[i]];
        }
        double ans = sumQ * ((double) wage[id[k - 1]] / quality[id[k - 1]]); // 选 r 值最小的 k 名工人组成当前的最优解
        for (int i = k; i < n; ++i) {
            int q = quality[id[i]];
            if (q < pq.peek()) { // sumQ 可以变小，从而可能得到更优的答案
                sumQ -= pq.poll() - q;
                pq.offer(q);
                ans = Math.min(ans, sumQ * ((double) wage[id[i]] / q));
            }
        }
        return ans;
    }
}
