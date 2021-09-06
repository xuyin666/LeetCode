package LinkedList;

// 21. Merge Two Sorted Lists
// Merge two sorted linked lists and return it as a sorted list.
// The list should be made by splicing together the nodes of the first two lists.
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        iterative
//        ListNode res = new ListNode(-1);
//        ListNode fakeHead = res;
//        while(l1 != null && l2 != null) {
//            if (l1.val < l2.val) {
//                res.next = l1;
//                l1 = l1.next;
//            } else {
//                res.next = l2;
//                l2 = l2.next;
//            }
//            res = res.next;
//        }
//        if (l1 != null) res.next = l1;
//        if (l2 != null) res.next = l2;
//        return fakeHead.next;

// recursive
        if (l1 == null || l2 == null) return l1 == null ? l2 : l1;
        if (l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
