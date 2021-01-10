package Tree;

import java.util.ArrayList;
import java.util.List;

// 257. Binary Tree Paths
// Given a binary tree, return all root-to-leaf paths.
// Note: A leaf is a node with no children.
public class BTreePath {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> aList = new ArrayList<>();
        if(root==null) return aList;
        String str = "";
        helper(root, str, aList);
        return aList;
    }

    public void helper(TreeNode root, String str, List<String> aList){
        if(root == null) return;
        str = str + root.val;
        if(root.left==null && root.right==null){
            aList.add(str);
            return;
        }
        String temp = str;
        if(root.left!=null){
            str = temp + "->";
            helper(root.left, str, aList);
        }
        if(root.right!=null){
            str = temp + "->";
            helper(root.right, str, aList);
        }
        return;
    }
}
