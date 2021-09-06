package LinkedList;

// 83. Remove Duplicates from Sorted List
// Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
// Return the linked list sorted as well.

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
//        iterative
//        ListNode curr = head;
//        while (curr != null && curr.next != null) {
//            if (curr.val == curr.next.val) {
//                curr.next = curr.next.next;
//            } else {
//                curr = curr.next;
//            }
//        }
//        return head;

//        recursive
        if (head == null || head.next == null)
            return head;
        ListNode noDuplicateList = deleteDuplicates(head.next);
        if (head.val == noDuplicateList.val)
            head.next = head.next.next;
        else
            head.next = noDuplicateList;
        return head;
    }
}
