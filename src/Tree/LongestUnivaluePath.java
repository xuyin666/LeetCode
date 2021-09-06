package Tree;

// 687. Longest Univalue Path
// Given the root of a binary tree, return the length of the longest path,
// where each node in the path has the same value. This path may or may not pass through the root.
// The length of the path between two nodes is represented by the number of edges between them.


////////////////////////// STOP


public class LongestUnivaluePath {
    int len = 0;
    public int longestUnivaluePath(TreeNode root) {

        return 0;
    }

    // must pass by the root
    public int getLength(TreeNode root) {
        if (root == null) return 0;
        int pr = getLength(root.right);
        int pl = getLength(root.left);
        int sum = 0;
        if (root.right != null && root.val == root.right.val) len = len + pr + 1;
        if (root.left != null && root.val == root.left.val) len = len + pl+ 1;
        return 0;
    }
}
