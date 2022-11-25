package BiliBili20220901;
import java.util.List;
import java.util.ArrayList;
public class CheckCOVID {
    static List<List<Integer>> res = new ArrayList<>();
    public static void main(String[] args) {
        int n =5;
        System.out.println(nucleicAcidTestWay(n));
    }
    public static int nucleicAcidTestWay (int n) {
        // write code here
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(res,path,n);
        return res.size();
    }
    private static void dfs(List<List<Integer>> res,List<Integer> path,int n){
        if(path.size()>=n){
            if(!res.contains(path)) res.add(new ArrayList<>(path));
            return ;
        }
        if(path.get(path.size()-1) >=n-2){
            if(!res.contains(path)) res.add(new ArrayList<>(path));
        }
        for(int i=1;i<n;i++){
            if(i>path.get(path.size()-1) && i<= path.get(path.size()-1)+2){
                path.add(i);
            }else{
                continue;
            }
            dfs(res,path,n);
            if(path.size()>=2){
                path.remove(path.size()-1);
            }
        }
    }
}
