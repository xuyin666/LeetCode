package Tree;

// 109. Convert Sorted List to Binary Search Tree

// Given the head of a singly linked list where elements are sorted in ascending order,
// convert it to a height balanced BST.
// For this problem, a height-balanced binary tree is defined as a binary tree
// in which the depth of the two subtrees of every node never differ by more than 1.


public class ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        return helper(head, null);
    }

    // contain start but don't contain end
    public TreeNode helper(ListNode start, ListNode end) {
        // because it conatins start and it doesn't contain end, it's absurd
        if (start == end) return null;
        ListNode fast = start;
        ListNode slow = start;
        while (fast != end && fast.next != end) {
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode root = new TreeNode(slow.val);
        root.left = helper(start, slow);
        root.right = helper(slow.next, end);
        return root;
    }
}
