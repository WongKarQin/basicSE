package LeetCode;
import java.util.Arrays;
//2022年8月7日16:07:36
//LeetCode6142
public class CountSickNumPair {
    public static class Solution {
        public long countBadPairs(int[] nums) {

            int len = nums.length;
            long ans = 0;
            int[] arr = new int[len];

            for (int i = 0; i < nums.length; i++) {
                arr[i] = nums[i] - i;
            }

            Arrays.sort(arr);

            for (int i = 0; i < len-1; i++) {
                int target = arr[i];
                int l;
//                int r = len - 1;
//                int index = find(arr, l, r, target);
//                if (index != -1)
//                    ans += len - index;
                for(l=i+1;l<len;l++){
                    if(arr[l]>target)break;
                }
                ans += len-l;
            }

            return ans;
        }

        int find(int[] arr, int left, int right, int target) {
            if (left > right) {
                return -1;
            }
            int l = left;
            int r = right;
            while (l < r) {
                int m = l + (r - l) / 2;
                if (arr[m] > target) {
                    r = m;
                } else {
                    l = m + 1;
                }
            }
            return arr[l] > target ? l : -1;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int []{4,1,3,3};
        Solution sl = new Solution();
        System.out.println(sl.countBadPairs(nums));
    }
}
