package TongHuaShunNLP20220905;

import java.util.Scanner;

//2022年9月5日15:10:40
public class TSP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] cost = new int[n][n];
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                cost[i][j]=sc.nextInt();
            }
        }
        int cur=0;
        boolean[] visted = new boolean[n];
        for(int i=0;i<n-1;i++){
            visted[cur]=true;
            int minCost = Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                if(!visted[j] && cost[cur][j]<=minCost){
                    minCost  =cost[cur][j];
                    cur = j;
                }
            }
            res+= minCost;
        }
        System.out.println(res);
    }
}
