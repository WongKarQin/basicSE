package FTNN439920220818;
import java.util.*;
public class Str {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String inStr = sc.nextLine();
        int cnt=0;
        int i = 0;
        for(;i<inStr.length()/2;i++){
            if(inStr.charAt(i)!=inStr.charAt(inStr.length()-i-1)) cnt++;
        }
        if(cnt==0)
        {
            System.out.println("true");
        }
        else if(cnt>1)
        {
            System.out.println("false");
        }
        else if(cnt==1){
            if(inStr.length()%2==0){
                System.out.println("true");
            }
            if(inStr.length()%2!=0){
                if(inStr.charAt(i)==inStr.charAt(inStr.length()-i-1-1)|| inStr.charAt(i+1)==inStr.charAt(inStr.length()-i-1)){
                    System.out.println("true");
                }else{
                    System.out.println("false");
                }
            }
        }
    }

}
