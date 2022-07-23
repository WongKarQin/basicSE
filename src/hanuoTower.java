//2022年7月22日23:34:55
import java.util.Scanner;
public class hanuoTower {
    public static int cnt = 0;
    private static String getType(Object a) {
        return a.getClass().toString();
    }

    public static void hannuo(int num, String start, String temp, String target){
        if (num==0) return;
        else if (num==1){
            System.out.println(num + " " + start + "-->" + target);
            cnt+=1;
            System.out.println("Times: "+cnt);
        }else{
            /*中序遍历*/
            hannuo(num-1,start,target,temp);/*实际意义开始状态，3个盘子其实将123中的1从start放入target最后才能达到最优放置*/
            System.out.println(num+ " " + start + "-->"+target);/*实际意义中点状态，具体操作将最大的盘子3从start单独一个放置到target*/
            cnt+=1;
            System.out.println("Times: "+cnt);
            hannuo(num-1,temp,start,target);/*实际意义收尾状态，具体操作将临界3个盘子其实将123中的12从temp开始放置到start*/
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(getType(num));
        String start = sc.next();
        System.out.println(getType(start));
        String temp = sc.next();
        System.out.println(getType(temp));
        String target = sc.next();
        System.out.println(getType(target));
        System.out.println(num+" "+start+" "+temp+" "+target);
        hannuo(num, start,temp, target);
        System.out.println("Times: "+cnt);
    }
}

/*
public class hanuoTower {
    public static void main(String[] args){
        System.out.println("this is a test program!!");
    }
}*/
