package Tree;

// 235. Lowest Common Ancestor of a Binary Search Tree

// Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
// According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q
// as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

//Constraints:
//
//        The number of nodes in the tree is in the range [2, 105].
//        -109 <= Node.val <= 109
//        All Node.val are unique.
//        p != q
//        p and q will exist in the BST.

public class LowestCommonAncestorBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(p.val<q.val){
            if(dfs(p.right, q)) return p;
            else return root;
        }else if(p.val > q.val ){
            if(dfs(q.right, p)) return q;
            else return root;
        }
        return null;
    }
    public boolean dfs(TreeNode root, TreeNode aNode){
        if(root==null) return false;
        if(root.val==aNode.val)
            return true;
        return dfs(root.left, aNode) || dfs(root.right, aNode);
    }

}
