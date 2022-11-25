package NetEase2022814;
//2022年8月14日15:32:36
import java.util.*;
public class StringRead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =Integer.parseInt(sc.nextLine());
        String[] strArr = new String[n];
        for(int i=0;i<n;i++){
            strArr[i] = sc.nextLine();
        }
        for(String strItem:strArr){
            String[] strSplit = strItem.split("#");
            boolean flag=false;
            for(String strInside:strSplit) {
                if(strInside.length()==0||strInside.length()==1) continue;
                if (strInside.contains("pan gu")) {
                    flag=true;
                    System.out.println("pan gu FF88FF");
                    //pan gu FF88FF
                    //qing qi E74C3C
                    // sheng,wei tian; 52BE80
                    //zhuo qi 2E86C1
                    // jiang, wei di 52BE80
                }
                if (strInside.contains("sheng,wei tian")) {
                    flag=true;
                    System.out.println(" sheng,wei tian; 52BE80");
                }
                if (strInside.contains("zhuo qi")) {
                    flag=true;
                    System.out.println("zhuo qi 2E86C1");
                }
                if (strInside.contains("qing qi")) {
                    flag=true;
                    System.out.println("qing qi E74C3C");
                }
                if (strInside.contains("jiang, wei di")) {
                    flag=true;
                    System.out.println(" jiang, wei di 52BE80");
                }
            }
            if(!flag){
                System.out.println("empty");
            }
        }
    }
}
