package Tree;

// 199. Binary Tree Right Side View
// Given a binary tree, imagine yourself standing on the right side of it,
// return the values of the nodes you can see ordered from top to bottom.

import java.util.ArrayList;
import java.util.List;

public class BTreeSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> aList = new ArrayList<>();
        if(root==null) return aList;
        TreeNode aNode = root;
        while( root!=null ){
            aList.add(root.val);
            if(root.right!=null){
                root = root.right;
            }else if(root.left!=null){
                root = root.left;
            }else{
                if(aNode.right!=null)
                    root = aNode.right;
                else if(aNode.left!=null){
                    root = aNode.left;
                }
            }
        }
        return aList;
    }
}
