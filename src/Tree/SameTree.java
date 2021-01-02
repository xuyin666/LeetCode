package Tree;

// Given the roots of two binary trees p and q, write a function to check if they are the same or not.
// Two binary trees are considered the same if they are structurally identical,
// and the nodes have the same value.

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null) return true;
        else if (p==null || q==null) return false;
        if(isSameTree(p.right, q.right) && isSameTree(p.left, q.left) && p.val==q.val)
            return true;
        return false;
    }
}
