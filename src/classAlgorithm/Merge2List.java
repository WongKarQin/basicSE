package classAlgorithm;
//剑指offer25：合并两个排序的链表
public class Merge2List {
    /**
     * Definition for singly-linked list.*/
     public static class ListNode{
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
        // 添加新的结点
        public void add(int newval) {
            ListNode newNode = new ListNode(newval);
            if(this.next == null)
                this.next = newNode;
            else
                this.next.add(newval);
        }
        // 打印链表
        public void print() {
            System.out.print(this.val);
            if(this.next != null)
            {
                System.out.print("-->");
                this.next.print();
            }else System.out.println();
        }

    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode l3 = prehead;
        while(l1.next!=null && l2.next!=null) {
            if(l1.val <= l2.val){
                l3.next = l1;
                l1 = l1.next;
            }else{
                l3.next = l2;
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        l3.next = (l1.next==null)? l2:l1;
        return prehead.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        l1.add(2);
        l1.add(4);
        l2.add(3);
        l2.add(4);
        l1.print();
        l2.print();
        ListNode result = mergeTwoLists(l1,l2);
        result.print();
    }
}
