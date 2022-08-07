package LeetCode;
//2022年8月4日12:14:59
//LeetCode最长公共前缀
public class CommonMaxString {
    public static String longestCommonPrefix(String[] strs) {
        String common = strs[0];//默认公共最长前缀为strs[0]
        //遍历strs
        for(int i =1;i<strs.length;i++){
            if(common.length()==0||strs[i].length()==0){//特例
                return "";
            }
            if(common.charAt(0)-strs[i].charAt(0)!=0){
                return "";
            }
            int j=0;
            int len_common = common.length()<strs[i].length()?common.length():strs[i].length();
            for(j=1;j<len_common;j++){
                if(common.charAt(j)-strs[i].charAt(j)!=0){
                    break;
                }
            }
            common = common.substring(0,j);
        }
        return common;
    }

    public static void main(String[] args) {
        String[] strs = new String[] {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
