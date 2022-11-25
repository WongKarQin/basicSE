package BiliBili20220901;
//2022年9月1日21:46:38
//新冠社区感染阻隔
//岛屿问题dfs
//0为健康 1为已感染
//010
//000
//则需要封堵3处A[0,0]A[0,2]A[1,1]
//输出一共需要封堵的
public class NcovDefect {
    public static void main(String[] args) {
//        int[][] grid = new int[][]{{0,1,0,0,0,0,0,1},
//                {0,1,0,0,0,0,0,1},
//                {0,0,0,0,0,0,0,1},
//                {0,0,0,0,0,0,0,0}};
        int[][] grid = new int[][]{{0,0,0,0,0,0,0,0},
                {0,0,1,1,0,0,0,0},
                {0,0,0,1,0,0,0,0},
                {0,0,0,0,0,0,0,0}};
        System.out.println(ncov_defect(grid));
    }
    public static int ncov_defect (int[][] grid) {
        // write code here
        boolean[][] flag1 =new boolean[grid.length][grid[0].length];//确保从1变为0的不被重复级数
        boolean[][] flag2 =new boolean[grid.length][grid[0].length];//确保拐角处原始的0不被重复封堵
        int res = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) res+=dfs(grid,i,j,flag1,flag2);
            }
        }
        return res;
    }
    public static int dfs(int[][] grid,int i,int j,boolean[][] flag1,boolean[][] flag2){
        if(i<0 || i>=grid.length ||j<0 || j>=grid[0].length) return 0;
        if(grid[i][j]==0){
            if(flag1[i][j] || flag2[i][j]){
                return 0;
            }else {
                flag2[i][j]=true;
                return 1;
            }
        }
        if(grid[i][j]==1){
            grid[i][j]=0;
            flag1[i][j]=true;
        }
        return dfs(grid,i-1,j,flag1,flag2)+
                dfs(grid,i+1,j,flag1,flag2)+
                dfs(grid,i,j-1,flag1,flag2)+
                dfs(grid,i,j+1,flag1,flag2);
    }
}
