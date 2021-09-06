package LinkedList;

// 206. Reverse Linked List
// Given the head of a singly linked list, reverse the list, and return the reversed list.
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
// iterative
//        if (head == null || head.next == null)
//            return head;
//        ListNode res = null;
//        while(head != null) {
//            ListNode tmp = head.next;
//            head.next = res;
//            res = head;
//            head = tmp;
//        }
//        return res;

        // recursive
        if (head == null || head.next == null)
            return head;
        ListNode res = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return res;
    }
}
