package meiTuan20220806;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class MagicStone {
    public static void main(String args[]) {
        HashMap<Integer,Integer> hm1 = new HashMap<Integer,Integer>();//初始正面种类x对应总数n1
        HashMap<Integer,Integer> hm2 = new HashMap<Integer,Integer>();//初始反面种类x对应总数n2
        HashSet<Integer> st = new HashSet<Integer>();//魔法石数字种类数
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int res = 0;
        for(int i =0;i<2;i++){//正反两面
            for(int j=0;j<amount;j++) {//amout块魔法石
                int num = sc.nextInt();
                st.add(num);
                if(i==0){
                    if (hm1.containsKey(num)) {
                        hm1.put(num, hm1.get(num) + 1);
                    } else {
                        hm1.put(num, 1);
                    }
                }else {
                    if (hm2.containsKey(num)) {
                        hm2.put(num, hm2.get(num) + 1);
                    } else {
                        hm2.put(num, 1);
                    }
                }
            }
        }
        if(2*st.size()>amount)
            System.out.println(st);
            System.out.println(hm1);
            System.out.println(hm2);
            System.out.println("-1");

    }
}
