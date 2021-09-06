package LinkedList;

// 24. Swap Nodes in Pairs
// Given a linked list, swap every two adjacent nodes and return its head.
// You must solve the problem without modifying the values in the list's nodes
// (i.e., only nodes themselves may be changed.)

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode tail = dummy;
        if (head == null || head.next == null)
            return head;
        ListNode p = head;
        ListNode q = head.next;
        while (p != null && q != null) {
            // (swap p q) and (link tail and p)
            p.next = q.next;
            q.next = p;
            tail.next = q;
            // move
            tail = p;
            p = tail.next;
            if (p == null) break;
            q = p.next;
        }
        return dummy.next;
    }
}
