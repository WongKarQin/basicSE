package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
//LeetCode0001
//2022年7月26日15:17:19
//题目描述：给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//你可以按任意顺序返回答案。
/*示例 1：

输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
示例 2：

输入：nums = [3,2,4], target = 6
输出：[1,2]
示例 3：

输入：nums = [3,3], target = 6
输出：[0,1]

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/two-sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class FindIndex2NumSum {
/*双循环暴力解法
    public static int[] Solution1(int[] nums, int target){
        int[] result = {0,0};
        label:
        for(int i = 0;i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                if ((target - nums[i]) == nums[j]){
                    System.out.println("["+i+","+j+"]");
                    result[0]=i;
                    result[1]=j;
                    break label;
                }
            }
        }
        return result;
    }*/

//方法2java自带的hash表数据结构
//2022年7月26日16:16:31
    public static int[] Solution2(int[] nums, int target){
        Hashtable<Integer, Integer> ht = new Hashtable(nums.length);//定义哈希表键值对全为整型
        for (int i =0;i<nums.length;i++){
            if(ht.containsKey(target - nums[i])){
                return new int[] {ht.get(target-nums[i]),i};
            }
            ht.put(nums[i],i);//往哈希表写入,索引i对应哈市表的键值value,数组值对应键名key。由.get造成的,无法直接由value得到key，反之可以。
        }
        throw new IllegalArgumentException("No two sum soultion");
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
//        System.out.println(Solution1(nums,target));
        System.out.println(Arrays.toString(Solution2(nums,target)));
    }
}