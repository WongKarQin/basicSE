package meiTuan20220806;

import java.util.Scanner;
public class TrainTestSplit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int classTotal = sc.nextInt();
        int[] Arr = new int[amount];
        int[] classCount = new int[classTotal];
        for(int i=0;i<amount;i++){
            Arr[i] = sc.nextInt();
            classCount[Arr[i]-1]++;
        }
        int[] currCount = new int[classTotal];
        int testLen = 0;
        for(int i =0;i<classTotal;i++){
            testLen+=classCount[i]/2;
        }
        int trainLen = amount-testLen;
        int[] train =new int[trainLen];
        int[] test =new int[testLen];
        int testIn=0;
        int trainIn=0;
        for(int i=0;i<amount;i++){
            currCount[Arr[i]-1]++;
            if(2*currCount[Arr[i]-1]>classCount[Arr[i]-1]+1){
                test[testIn] = i+1;
                testIn++;
            }else{
                train[trainIn] = i+1;
                trainIn++;
            }
        }
        for(int i=0;i<trainLen;i++){
            System.out.print(train[i]+" ");
        }
        System.out.println();
        for(int i=0;i<testLen;i++){
            System.out.print(test[i]+" ");
        }
    }
}
