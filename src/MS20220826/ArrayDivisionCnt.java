package MS20220826;
import java.lang.Math.*;
import java.util.HashSet;

//        int[] A = {-3,-2,1,0,8,7,1};
//        int N = 7;
//        int M = 3;
//返回数组A中满足特定条件的子集数。N为数组A的长度，M为基准距离。
//Math.abs(A[1]-A[2])==M==3
//而Math.abs(A[1]-A[6])==3 3%M==0 Math.abs(A[2]-A[6])==0 0%M=0
//而Math.abs(A[1]-A[5])==9 9%M==0 Math.abs(A[2]-A[5])==6 6%M=0
//0,3,9,6共4个不同的子集。

public class ArrayDivisionCnt {
    public static int solution(int A[], int N, int M) {
        // write your code in C (C99 (gcc 6.2.0))
        HashSet<Integer> hs = new HashSet<Integer>();
        int res =1;
        for(int i=0;i<N-1;i++){
            int curNum = A[i];
            for(int j=i+1;j<N;j++){
                int nextNum = A[j];
                if(Math.abs(nextNum-curNum)==M){
                    for(int m=0;m<N;m++){
                        if(m==i||m==j) continue;
                        if(Math.abs(A[m]-curNum)%M==0){
                            if(Math.abs(A[m]-nextNum)%M==0){
                                hs.add(Math.abs(A[m]-curNum));
                                hs.add(Math.abs(A[m]-nextNum));
                            }
                        }
                    }
                }
            }
        }
        res = Math.max(res,hs.size());
        return res;
    }
    public static void main(String[] args) {
        int[] A = {-3,-2,1,0,8,7,1};
        int N = 7;
        int M = 3;
//        int[] A = {7,1,11,8,4,10};
//        int N = 6;
//        int M = 8;
        System.out.println(solution(A,N,M));
    }
}
