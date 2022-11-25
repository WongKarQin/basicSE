package JD20220827;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrettyStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] chArr =new char[]{'r','e','d'};
        List<String> list = dfs(chArr,new ArrayList<String>(),new StringBuilder(),n);
        System.out.println(list.size());
    }
    private static List<String> dfs(char[] chArr, List<String> res,StringBuilder sb, int n){
        if(sb.length()==n){
            if(isPretty(sb.toString())){
                res.add(sb.toString());
                return res;
            }
            return new ArrayList<>();
        }
        for(char ch : chArr){
            sb.append(ch);
            dfs(chArr,res,sb,n);
            sb.deleteCharAt(sb.length()-1);
        }
        return res;
    }
    private static boolean isPretty(String str){
        int cnt=0;
        for(int i=0;i<str.length()-2;i++){
            if(cnt>=2) return true;
            if(str.charAt(i)=='r'){
                if(str.charAt(i+1)=='e'){
                    if(str.charAt(i+2)=='d') cnt++;
                }
            }
        }
        return false;
    }
}
