package LeetCode;
import java.util.Arrays;
//2022年8月7日16:07:36
//LeetCode6142
public class CountSickNumPair {
    public static class Solution {
        public static int numBinarySearch(int[] nums,int target,int left,int right){
            int index = -1;
            if(right-left==1){
                if(nums[right]>nums[left]){
                    return right;
                }else{
                    return index;
                }
            }
            if(right-left==2){
                if(nums[right-1]>nums[left]){
                    return right-1;
                }else if(nums[right]>nums[left]){
                    return right;
                }else{
                    return index;
                }
            }
            while(left<right){
                int mid = (right-left)/2 +left;
                if(nums[mid]>target){
                    index = mid;
                    right = mid;
                }else{
                    left =mid+1;
                }
            }
            return index;
        }
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
                int l = i;
                int r = len - 1;
                int index = numBinarySearch(arr, target, l, r);
                if(index!=-1) ans += len-index;
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int []{4,1,3,3};
        Solution sl = new Solution();
        System.out.println(sl.countBadPairs(nums));
    }
}
