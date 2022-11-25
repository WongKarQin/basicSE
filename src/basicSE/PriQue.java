package basicSE;

import java.util.PriorityQueue;

//优先队列PriorityQueue<Integer>
//实现大根堆或者小根堆
public class PriQue {
    public static void main(String[] args) {
        int [] arr = new int[]{11,0,2,5,4,-1};
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);//大根堆 降序
        for (int i = 0; i < n; ++i) {
            pq.offer(arr[i]);
        }
        while(!pq.isEmpty()) {
            System.out.println(pq.peek());
            System.out.println(pq.poll());
        }
    }
}
