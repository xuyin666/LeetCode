package LinkedList;

// 234. Palindrome Linked List
// Given the head of a singly linked list, return true if it is a palindrome.

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        ListNode tmp = reverse(slow);
        while (tmp != null) {
            if (tmp.val != head.val)
                return false;
            tmp = tmp.next;
            head = head.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
//        if (head == null || head.next == null)
//            return head;
//        ListNode res = null;
//        while (head != null) {
//            ListNode tmp = head.next;
//            head.next = res;
//            res = head;
//            head = tmp;
//        }
//        return res;

        if (head == null || head.next == null) return head;
        ListNode res = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return res;
    }
}
