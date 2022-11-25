package MS20220826;

public class MatrixSumSearch {
    public static int solution(int[][] A) {
        // write your code in [LANGVER]
        int n = A.length;
        int m = A[0].length;
        int[] sumR= new int[n];
        int[] sumC = new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sumR[i]+=A[i][j];
                sumC[j]+=A[i][j];
            }
        }
        int cntR=0;
        int cntC=0;
        for(int i=0;i<n-1;i++){
            int target = sumR[i];
            // for(int j=i+1;j<n;j++){
            //     if(sumR[j]>target) continue;
            cntR+=backTrack(A,sumR,target,0,0,i);
        }

        for(int i=0;i<m-1;i++){
            int target = sumC[i];
            // for(int j=i+1;j<n;j++){
            //     if(sumR[j]>target) continue;
            cntC+=backTrack(A,sumC,target,0,0,i);

        }
        if(cntR>1) cntR=cntR/2;
        if(cntC>1) cntC=cntC/2;
        return cntR*cntC;
    }

    private static int backTrack(int[][] A,int[] sum,int target,int start,int cnt,int idx){
        if(target<=0){
            if(target==0){
                cnt++;
                return cnt;
            }
            return 0;
        }
        for(int i=start;i<sum.length;i++){
            if(i==idx) continue;
            target-=sum[i];
            cnt+=backTrack(A,sum,target,i+1,cnt,idx);
            target+=sum[i];
        }
        return cnt;
    }
    public static void main(String args[]){
        int[][] A ={{2,7,5},{3,1,1},{2,1,-7},{0,2,1},{1,6,8}};
        System.out.println(solution(A));
    }
}
