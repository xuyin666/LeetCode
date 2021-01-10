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
    // iterative
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        while(true){
//            int pVal = root.val - p.val;
//            int qVal = root.val - q.val;
//            if(pVal>0 && qVal>0){
//                root = root.left;
//            }else if(pVal<0 && qVal<0){
//                root = root.right;
//            }else{
//                break;
//            }
//        }
//        return root;
//    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
            int pVal = root.val - p.val;
            int qVal = root.val - q.val;
            if( pVal > 0 && qVal > 0){
                return lowestCommonAncestor(root.left, p, q);
            }else if(pVal < 0 && qVal < 0){
                return lowestCommonAncestor(root.right, p, q);
            }else{
                return root;
            }
    }

}
