package Tree;

// 501. Find Mode in Binary Search Tree


// Given a binary search tree (BST) with duplicates,
// find all the mode(s) (the most frequently occurred element) in the given BST.
// Assume a BST is defined as follows:
// The left subtree of a node contains only nodes with keys less than or equal to the node's key.
// The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
// Both the left and right subtrees must also be binary search trees.


import java.util.ArrayList;
import java.util.List;



public class FindModeinBST {
    TreeNode prev=null;
    int count = 1;
    int max = 0;

    public int[] findMode(TreeNode root) {
        List<Integer> maList = new ArrayList<>();
        helper(root, maList);
        return maList.stream().mapToInt(i->i).toArray();

    }

    public void helper(TreeNode root, List<Integer> maList){
        if(root==null) return;
        helper(root.left, maList);
        if(prev!=null){
            if(prev.val == root.val){
                count++;
            }else{
                count = 1;
            }
        }
        if(max < count){
            maList.clear();
            maList.add(root.val);
            max = count;
        }else if(max == count){
            maList.add(root.val);
        }
        prev = root;
        helper(root.right, maList);
    }
}
