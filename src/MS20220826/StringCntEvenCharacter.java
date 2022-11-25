package MS20220826;

import java.util.ArrayList;
import java.util.List;
//题目：字符串S:"bdaaadadb"
//在其诸多连续且长度为偶数的子序列中，返回长度最大的的序列长度
//bd bdaa bdaaad bdaaadad...
//[b, d]
//[b, d, a, a]
//[b, d, a, a, a, d]
//[b, d, a, a, a, d, a, d]
//[d, a]
//[d, a, a, a]
//[d, a, a, a, d, a]
//[d, a, a, a, d, a]
//[d, a, a, a, d, a, d, b]
//[a, a]
//[a, a, a, d]
//[a, a, a, d, a, d]
//[a, a, d, a]
//[a, a, d, a, d, b]
//[a, d]
//[a, d, a, d]
//[d, a, d, b]
//[d, b]
//6
public class StringCntEvenCharacter {
    static boolean[] used;
    public static int solution(String S) {
        // write your code in Java 11 (Java SE 11)
        used = new boolean[S.length()];
        int res=0;
        List<List<Character>> lt = new ArrayList<>();
        System.out.println(lt.size());
        backTrack(lt,new ArrayList<>(),S,0);
        for(int i=0;i<lt.size();i++){
            StringBuilder sb = new StringBuilder();
            for (Character ch :lt.get(i)){
                sb.append(ch);
            }
            String tmp = sb.toString();
            int newLen = checkLen(tmp);
            if(newLen>res){
                res = newLen;
//                System.out.println(lt.get(i));
            }
//            System.out.println(lt.get(i));
        }
        return res;
    }
    private static int checkLen(String tmp){
        int[] cnt = new int[26];
        for(int i=0;i<tmp.length();i++){
            cnt[tmp.charAt(i)-'a']++;
        }
        for(int i=0;i<cnt.length;i++){
            if(cnt[i]%2!=0) return 0;
        }
        return tmp.length();
    }
    private static void backTrack(List<List<Character>> lt, List<Character> path ,String s,int start){
        if(path.size()>0 && path.size()%2==0){
            if(!lt.contains(path)) {
                lt.add(new ArrayList<>(path));
            }
        }
        if(path.size()>=s.length()) return;
        for(int i=start;i<s.length();i++){
            if(i>0 && !used[i-1]) continue;
            used[i]=true;
            path.add(s.charAt(i));
            backTrack(lt,path,s,i+1);
            used[i]=false;
            path.remove(path.size()-1);
            if(path.size()==0) used[i]=true;
        }
    }
    public static void main(String[] args) {
        String s  = "bdaaadadb";
//        String s  = "bdadb";
        System.out.println(solution(s));
    }
}
