package LinkedList;

// 725. Split Linked List in Parts
// Given the head of a singly linked list and an integer k, split the linked list into k consecutive linked list parts.
// The length of each part should be as equal as possible:
// no two parts should have a size differing by more than one.
// This may lead to some parts being null.
// The parts should be in the order of occurrence in the input list,
// and parts occurring earlier should always have a size greater than or equal to parts occurring later.
// Return an array of the k parts.

public class SplitLinkedListInParts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] listNodes = new ListNode[k];
        ListNode tmp = head;
        int lenList = 0;
        while (tmp != null) {
            lenList++;
            tmp = tmp.next;
        }
        int a = lenList / k;
        int b = lenList % k;
        ListNode prev = null;
        ListNode curr = head;
        for (int i = 0; i < k; i++, b--) {
            int rest = b > 0 ? 1 : 0;
            listNodes[i] = curr;
            for (int j = 0; j < a + rest; j++) {
                prev = curr;
                curr = curr.next;
            }
            if(prev != null) prev.next = null;
        }
        return listNodes;
    }
}
