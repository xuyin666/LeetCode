package LinkedList;

public class ListNode {
    int val;
    ListNode next;
//    ListNode(int x) {
//        val = x;
//        next = null;
//    }
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
