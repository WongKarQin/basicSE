package LeetCode;
//LeetCode239
//2022年9月2日15:02:24
import java.util.Comparator;
import java.util.PriorityQueue;
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums =new int[] {1,3,-1,-3,5,3,6,7};
        int k = 3;
        Solution s = new Solution();
        int[] res = s.maxSlidingWindow(nums,k);
        System.out.println(res);
    }
    public static class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int n = nums.length;
            PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
                public int compare(int[] pair1, int[] pair2) {
                    return pair1[0] != pair2[0] ? pair2[0] - pair1[0] : pair2[1] - pair1[1];
                }
            });
            for (int i = 0; i < k; ++i) {
                pq.offer(new int[]{nums[i], i});
            }
            int[] ans = new int[n - k + 1];
            ans[0] = pq.peek()[0];
            for (int i = k; i < n; ++i) {
                pq.offer(new int[]{nums[i], i});
                while (pq.peek()[1] <= i - k) {
                    pq.poll();
                }
                ans[i - k + 1] = pq.peek()[0];
            }
            return ans;
        }
    }
}
