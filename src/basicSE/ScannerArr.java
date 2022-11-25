package basicSE;
import java.util.Scanner;
public class ScannerArr {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int maxV = arr[0];
            int minV = arr[n-1];
            int idxMax = 0;
            int idxMin = n-1;
            for(int i=0;i<n;i++){
                if(arr[i]>maxV){
                    maxV = arr[i];
                    idxMax = i;
                }
                if(arr[i]<minV){
                    minV = arr[i];
                    idxMin = i;
                }
            }
            if(0!=idxMax) {
                for (int i = n-1; i >=1 ; i--) {
                    if(i==idxMax+1){
                        continue;
                    }
                    arr[i]=arr[i-1];
                }
                arr[0]=maxV;
            }
            if(n-1 !=idxMin) {
                idxMin++;
                for (int i = idxMin; i <=n-2 ; i++) {
                    arr[i]=arr[i+1];
                }
                arr[n-1]=minV;
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]);
            }
        }
}
//输入
//6
//2 1 3 4 6 5
//621345
//623451