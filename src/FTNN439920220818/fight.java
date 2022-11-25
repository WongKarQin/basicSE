package FTNN439920220818;

import javax.sound.midi.Soundbank;
import java.util.*;

//能量战斗
//田忌赛马
public class fight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arrA  = new int[3];
        int [] arrB  = new int[3];
        for(int i=0;i<3;i++){
            arrA[i] = sc.nextInt();
        }
        for(int i=0;i<3;i++){
            arrB[i] = sc.nextInt();
        }
        int n = sc.nextInt();//能量包个数
        int power = sc.nextInt();
        int cnt =0;
        for(int i=0;i<3;i++){
            if(arrB[i]>arrA[i]){
                cnt++;
            }else{
                if(n>0) {
                    if(arrB[i] + power >arrA[i]){
                        cnt++;
                        n--;
                    }
                }
            }

        }
        System.out.println(cnt);
    }
}
