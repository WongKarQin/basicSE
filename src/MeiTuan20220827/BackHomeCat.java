package MeiTuan20220827;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class BackHomeCat {
    public static void main(String[] args) {
        int res = 0;
        Scanner sc = new Scanner(System.in);
        int nEvent = sc.nextInt();
        int nToy = sc.nextInt();
        int T = sc.nextInt();
        int[] toyTime = new int[nToy];
        int[] toyUse = new int[nToy];
        int[] events = new int[nEvent];
        int flag = 0;
        for (int i = 0; i < nToy; i++) {
            toyTime[i] = sc.nextInt();
        }
        for (int i = 0; i < nEvent; i++) {
            events[i] = sc.nextInt();
        }
        for (int i = 0; i < nEvent; i++) {
            if (events[i] == 0) {
                if (flag > 0) {
                    int minToyTime = T + 1;
                    int mark = -1;
                    for (int j = 0; j < nToy; j++) {
                        if (toyUse[j] != 0) {
                            if (toyTime[j] < minToyTime) {
                                minToyTime = toyTime[j];
                                mark = j;
                            }
                        }
                    }
                    if (minToyTime < T) {
                        res += minToyTime;
                        toyUse[mark]--;
                    } else {
                        res += T;
                    }
                } else {
                    res += T;
                }
            } else {
                toyUse[events[i] - 1]++;
                flag++;
            }
        }
        System.out.println(res);
    }
}
//    private static boolean checkToy(int[] toyUse){
//        int sum=0;
//        for(int item:toyUse){
//            sum+=item;
//            if(sum!=0) return true;
//        }
//        return false;
//    }

