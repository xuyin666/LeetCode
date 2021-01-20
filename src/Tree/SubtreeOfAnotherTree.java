package Tree;


// 572. Subtree of Another Tree

// Given two non-empty binary trees s and t,
// check whether tree t has exactly the same structure and node values with a subtree of s.
// A subtree of s is a tree consists of a node in s and all of this node's descendants.
// The tree s could also be considered as a subtree of itself.


public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return dfs(s, t);
    }

    public boolean dfs(TreeNode s, TreeNode t){
        if(s==null) return false;
        if(helper(s, t))
            return true;
        else
            return dfs(s.left, t) || dfs(s.right, t);

    }

    public boolean helper(TreeNode s, TreeNode t){
        if(s==null && t==null) return true;
        if(s==null || t==null) return false;
        if(s.val!=t.val)
            return false;
        return helper(s.left, t.left) && helper(s.right, t.right);
    }
}
