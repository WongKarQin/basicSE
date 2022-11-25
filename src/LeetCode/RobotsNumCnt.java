package LeetCode;
import java.util.Arrays;
//6143-2022年9月3日23:41:28
public class RobotsNumCnt {
    public static void main(String[] args) {
        int[] ch=new int[]{3,6,1,3,4};
        int[] run=new int[]{2,1,3,4,5};
        long budget=25 ;
        int res=maximumRobots(ch,run,budget);
        System.out.println(res);
    }
    public static int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) {
        int res=0;
        int n = chargeTimes.length;
        int l=0,r=n-1;
        int sum=0;
        for(int i=l;i<=r;i++){
            sum+=runningCosts[i];
        }
        int maxV = Arrays.stream(chargeTimes).max().getAsInt();
        int cost = maxV*(r-l+1)*sum;
        int costR = chargeTimes[r]*runningCosts[r];
        int costL = chargeTimes[l]*runningCosts[l];
        while(l<r){
            if(cost<=budget){
                if(r-l+1>res){
                    res=r-l+1;
                }
            }else{
                if(costR>costL){
                    r--;
                    costR = chargeTimes[r]*runningCosts[r];
                }else{
                    l++;
                    costL = chargeTimes[l]*runningCosts[l];
                }
                sum=0;
                for(int i=l;i<=r;i++){
                    sum+=runningCosts[i];
                }
                int[] tmp = new int[r-l+1];
                for(int i=0;i<=r-l;i++){
                    tmp[i]=chargeTimes[i+l];
                }
                maxV = Arrays.stream(tmp).max().getAsInt();
                cost = maxV*(r-l+1)*sum;
            }
        }
        return res==0?1:res;
    }
}
