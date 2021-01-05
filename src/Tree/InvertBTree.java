package Tree;
//226. Invert Binary Tree
public class InvertBTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        if(root.left!=null && root.right!=null){
            TreeNode aNode = invertTree(root.left);
            TreeNode anoNode = invertTree(root.right);
            root.right = aNode;
            root.left = anoNode;
        }
        else if(root.left!=null){
            root.right = invertTree(root.left);
            root.left = null;
        }
        else if(root.right!=null){
            root.left = invertTree(root.right);
            root.right = null;
        }
        return root;
    }
}
