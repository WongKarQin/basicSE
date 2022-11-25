package MS20220826;

//合并2个长度相等的数组A和B
//合并规则 取同位置元素较大的一个
//返回1到N的缺失数值
//        int [] A = {1,2,4,3};
//        int [] B = {1,3,2,3};
//        int [] C = {1,3,4,3};
//返回2。1 3 4中缺少2。
public class Merge2ArrayReturnDiff {
    public static int solution(int[] A, int[] B) {
        // write your code in Java 11 (Java SE 11)
        int res=0;
        int[] c = new int[A.length];
        int[] cnt = new int[1000001];
        for(int i=0;i<A.length;i++){
            c[i]=A[i]>=B[i]?A[i]:B[i];
        }
        for(int i=0;i<c.length;i++){
            cnt[c[i]-1]=1;
        }
        for(int i=0;i<=c.length;i++){
            if(cnt[i]==0){
                res=i+1;
                return res;
            }
        }
        return res;
    }
    public static void main(String[] args) {
//        int [] A = {1,2,4,3};
//        int [] B = {1,3,2,3};
//        int [] A = {3,2,1,6,5};
//        int [] B = {4,2,1,3,3};
        int [] A = {1,2};
        int [] B = {1,2};
        System.out.println(solution(A,B));
    }
}
