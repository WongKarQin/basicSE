package NetEase2022814;

import java.util.*;

//2022年8月14日14:29:00
public class StringGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrInt =new int[n];
        for(int i=0;i<n;i++){
            arrInt[i] = sc.nextInt();
        }
        char[] arrChar = new char[n];
        for(int i = 0; i < n; i++){
            arrChar[i] = '0';
        }
        int charInt = 0;
        int temp=0;

        for(int X=0;X<=999;X++){
            for (int i = 0; i < n; i++) {
                charInt = arrInt[i] - X;
//                arrChar[i] =(charInt==32||(charInt>=65 && charInt<=90))?arrChar[i]:(char) (arrInt[i] - X);
                if(charInt==32||(charInt>=65 && charInt<=90)){
                    arrChar[i] =(char) charInt;
                }else{
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arrChar[i]+"");
        }
    }
}
