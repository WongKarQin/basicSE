package classAlgorithm;
//2022年7月28日16:43:43
//合并2个排序好的数组
//数组A[1...m] 2个子数组A[p...q]和A[q+1...r]
//返回排序好的数组A
//该算法解法思路：2个自数列拼接后，再排序。
//两个子数列拼接后，再排序。
//数组A[1...r]和它的三个索引p,q,r,1≤p≤q≤r。两个子数组A1[0...q]和A2[q+1...r]各自按升序排列。
public class Merge2Array {
//    public void merge(int[] nums1, int len1, int[] nums2, int len2) {
//        int q = len1-1;
//        int r = len1+len2-1;
//        int[] temp = new int [len1+len2];
//        for(int i = 0; i<len1+len2;i++){
//            temp[i]=nums1[i];
//            if(i>=len1) temp[i]=nums2[i-len1];
//        }
//        int s = 0,t = len1, k =0;
//        while(s<=q&&t<=r){
//            if (temp[s]<=temp[t]){
//                nums1[k] = temp[s];
//                s++;
//            }else{
//                nums1[k] = temp[t];
//                t++;
//            }
//            k++;
//        }
//        if(s==q+1){
//            for(int i =k;i<=r;i++){
//                nums1[i] = temp[t];
//                t++;
//            }
//        }else{
//            for(int i =k;i<=r;i++){
//                nums1[i] = temp[s];
//                s++;
//            }
//        }
//
//    }
    //leetcode官方推荐代码
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0;
        int[] sorted = new int[m + n];
        int cur;
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1++];
            } else {
                cur = nums2[p2++];
            }
            sorted[p1 + p2 - 1] = cur;
        }
        for (int i = 0; i != m + n; ++i) {
            nums1[i] = sorted[i];
        }
    }
    public static void main(String[] args) {

    }
}
