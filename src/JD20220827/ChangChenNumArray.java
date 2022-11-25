package JD20220827;

import java.util.Scanner;

public class ChangChenNumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res =0;
        int n = sc.nextInt();
        int[] numArr = new int[n];
        int maxNum=-1;
        for(int i=0;i<n;i++){
            numArr[i]= sc.nextInt();
            if(numArr[i]>maxNum) maxNum=numArr[i];
        }
        int[] commonTwoNum = findCommonTwoNum(numArr,maxNum);
        if(!check(numArr)){
            for(int i=1;i<n-1;i++){
                if (numArr[i+1]!=numArr[i-1]){
                    if(numArr[i-1]==commonTwoNum[0] || numArr[i-1]==commonTwoNum[1])
                    {
                        numArr[i+1]=numArr[i-1];
                        res++;
                    }else{
                        numArr[i+1]=commonTwoNum[0];
                        numArr[i-1]=commonTwoNum[0];
                        res+=2;
                    }
                }
            }
        }
        System.out.println(res);
    }
    private static boolean check(int[] numArr){
        for(int i=1;i<numArr.length-1;i++){
            if(numArr[i+1]!=numArr[i-1]) return false;
        }
        return true;
    }
    private static int[] findCommonTwoNum(int[] numArr,int maxNum){
        int[] TwoNumArr = new int[2];
        int[] cntArr= new int[maxNum];
        for(int i=0;i<numArr.length;i++){
            cntArr[numArr[i]-1]++;
        }
        int maxCnt = 0;
        int maxV=0;
        int mark=0;
        for(int i=0;i<maxNum;i++){
            if(cntArr[i]>maxCnt){
                maxCnt = cntArr[i];
                maxV = i+1;
                mark=i;
            }
        }
        TwoNumArr[0]=maxV;
        maxCnt = 0;
        maxV=0;
        for(int i=0;i<maxNum;i++){
            if(i==mark) continue;
            if(cntArr[i]>maxCnt){
                maxCnt = cntArr[i];
                maxV = i+1;
            }
        }
        TwoNumArr[1]=maxV;
        return TwoNumArr;
    }
}
