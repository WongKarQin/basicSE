package TongHuaShunNLP20220905;

import java.util.Scanner;

public class PointInCricle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res=4*(n-1)+1;
        int tmp = n-1;
        int i;
        int m = 0;
        for(i=n-1;i>=1;i--){
            if(tmp*tmp + i*i<n*n) break;
        }
        m = (n-1)*i+(i+n-2)*(n-1-i)/2;
        res+=4*m;
        System.out.println(res);
    }
}
