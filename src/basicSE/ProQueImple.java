package basicSE;

import java.util.Arrays;

//优先队列数据结构实现
//2022年9月12日00:26:38
public class ProQueImple {
    private int size;
    private int[] queue;

    public ProQueImple() {
        this.size = 0;
        this.queue = new int[64];
    }

    public void push(int value) {
        if (size >= queue.length) {
            resize();
        }
        queue[size++] = value;
        adjustUp();
    }

    public int pop() throws Exception {
        if (size <= 0) {
            throw new Exception("queue is empty");
        }
        int popValue = queue[0];
        queue[0] = queue[--size];
        adjustDown();
        return popValue;
    }
    public int peek() throws Exception {
        if (size < 0) {
            throw new Exception("queue is empty");
        }
        return queue[0];
    }

    public boolean contains(int value) {
        return binarySearch(value);
    }

    public void clear() {
        size = 0;
    }

    public boolean isEmpty() {
        return size > 0;
    }

    public int[] toArray() {
        return Arrays.copyOf(queue, size);
    }

    private void adjustUp() {
        int currentIndex = size - 1;
        int parentIndex = currentIndex >> 1;
        int temp = queue[currentIndex];
        // currentIndex == 0 => reach root
        while (currentIndex > 0 && queue[parentIndex] < temp) {
            queue[currentIndex] = queue[parentIndex];
            currentIndex = parentIndex;
            parentIndex >>= 1;
        }
        queue[currentIndex] = temp;
    }

    private void adjustDown() {
        int parentIndex = 0;
        int temp = queue[parentIndex];
        for (int currentIndex = 1; currentIndex < size; currentIndex = currentIndex << 1 | 1) {
            if (currentIndex + 1 < size && queue[currentIndex + 1] > queue[currentIndex]) {
                currentIndex++;
            }
            if (temp >= queue[currentIndex]) {
                break;
            }
            queue[parentIndex] = queue[currentIndex];
            parentIndex = currentIndex;
        }
        queue[parentIndex] = temp;
    }

    private boolean binarySearch(int value) {
        int left = 0, right = size - 1, mid = 0;
        while (left <= right) {
            mid = (left + right) >> 1;
            if (queue[mid] == value) {
                return true;
            }
            if (queue[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    private void resize() {
        queue = Arrays.copyOf(queue, size << 1);
    }
    public static void main(String[] args) throws Exception {
        ProQueImple pq = new ProQueImple();
        pq.push(4);
        pq.push(5);
        pq.push(3);
        pq.push(1);
        pq.push(2);

        showArray(pq);
        System.out.println("pop value = " + pq.pop());
        System.out.println("peek value = " + pq.peek());
        showArray(pq);
        System.out.println("queue contains 2 = " + pq.contains(2));
    }

    public static void showArray(ProQueImple pq) {
        System.out.print("queue elements: ");
        int[] arr = pq.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
