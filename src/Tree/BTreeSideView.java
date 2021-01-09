package Tree;

// 199. Binary Tree Right Side View
// Given a binary tree, imagine yourself standing on the right side of it,
// return the values of the nodes you can see ordered from top to bottom.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTreeSideView {
//    public List<Integer> rightSideView(TreeNode root) {
//        List<Integer> aList = new ArrayList<>();
//        if(root==null) return aList;
//        Queue<TreeNode> q = new LinkedList<>();
//        q.add(root);
//        while(!q.isEmpty()){
//            int sizeQ = q.size();
//            int i =0;
//            while(i<sizeQ){
//                TreeNode aNode = q.remove();
//                if(aNode.left!=null){
//                    q.add(aNode.left);
//                }
//                if(aNode.right!=null){
//                    q.add(aNode.right);
//                }
//                if(i==sizeQ-1){
//                    aList.add(aNode.val);
//                }
//                i++;
//            }
//        }
//        return aList;
//    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> aList = new ArrayList<>();
        rightView(root, aList, 0);
        return aList;
    }

    public void rightView(TreeNode root, List<Integer> aList, int currDepth){
        if(root==null)
            return ;
        if(currDepth==aList.size()){
            aList.add(root.val);
        }
        rightView(root.right, aList, currDepth+1);
        rightView(root.left, aList, currDepth+1);
    }
}
