package LeetCode;
import java.util.Arrays;
//6160. 和有限的最长子序列
public class LimitedSumSubNums {
    public static int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] res =new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int target = queries[i];
            int sum=0;
            for(int j=0;j<nums.length;j++){
                sum+=nums[j];
                if(sum>target){
                    res[i]=j;
                    sum-=nums[j];
                    break;
                }
                if(j==(nums.length-1)){
                    res[i]=nums.length;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,5,2,1};
        int[] queries = new int[]{3,10,21};
        int[] res = answerQueries(nums,queries);
        for(int num:res){
            System.out.print(num+" ");
        }
    }
}
