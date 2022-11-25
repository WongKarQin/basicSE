package JD20220827;

import java.util.Scanner;

public class LowStrAndHighStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//str长度
        int k = sc.nextInt();//前k个大写,后n-k个小写
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            if(i<k) {
                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                    sb.append(str.charAt(i));
                }else{
                    int it =(int) str.charAt(i)-32;
                    char ch = (char) it;
                    sb.append(ch);
                }
            }else{
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                    sb.append(str.charAt(i));
                }else{
                    int it =(int) str.charAt(i)+32;
                    char ch = (char) it;
                    sb.append(ch);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
