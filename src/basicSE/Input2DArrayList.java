package basicSE;
import java.io.*;
import java.util.*;
//2022年8月3日23:31:13
//折磨人的oj
//没有给出矩阵的行列数
/*有些输入可能是：
    输入一个矩阵，每行以空格分隔。
    3 2 3
    1 6 5
    7 8 9
        */

class Solution {
    public void myFunc(ArrayList<ArrayList<Integer>> arr) {
        // 使用自测数据按钮时调试用，正式提交时要删掉。
        System.out.println(arr);
    }
}
public class Input2DArrayList
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        while(cin.hasNextLine())
        {
            ArrayList<Integer> row = new ArrayList<Integer>();
            String line = cin.nextLine();
            if (line.length() > 0) {
                String[] arrLine = line.split(" ");
                for (int i=0; i<arrLine.length; i++) {
                    row.add(Integer.parseInt(arrLine[i]));
                }
                arr.add(row);
            }
        }

        new Solution().myFunc(arr);
    }
}

