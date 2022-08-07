package meiTuan20220806;

import java.util.Scanner;

public class Cake{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        while(line>0){
            int x = sc.nextInt();
            int y =sc.nextInt();
            int res=0;
            int num_less = x>y?y:x;
            int num_large = x<y?y:x;
            if(num_large>=2*num_less){
                res = num_less;
            }else{
                res = (num_less+num_large)/3;
            }
            System.out.println(res);
            line--;
        }
    }
}
