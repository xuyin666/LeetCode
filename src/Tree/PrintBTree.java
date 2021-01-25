package Tree;

// 655. Print Binary Tree

// Print a binary tree in an m*n 2D string array following these rules:

// The row number m should be equal to the height of the given binary tree.
// The column number n should always be an odd number.
// The root node's value (in string format) should be put in the exactly middle of the first row it can be put.
// The column and the row where the root node belongs
// will separate the rest space into two parts (left-bottom part and right-bottom part).
// You should print the left subtree in the left-bottom part and print the right subtree in the right-bottom part.
// The left-bottom part and the right-bottom part should have the same size.
// Even if one subtree is none while the other is not,
// you don't need to print anything for the none subtree
// but still need to leave the space as large as that for the other subtree.
// However, if two subtrees are none, then you don't need to leave space for both of them.
// Each unused space should contain an empty string "".
// Print the subtrees following the same rules.

import java.util.ArrayList;
import java.util.List;

public class PrintBTree {
    int hauteur;
    public List<List<String>> printTree(TreeNode root) {
        List<List<String>> aList = new ArrayList<>();
        int h = getHeight(root);
        hauteur = h-1;
        int w = (1<<h)-1;
        List<String> newList;
        for(int i=0; i<h; i++){
            newList = new ArrayList<>();
            for(int j=0; j<w; j++){
                newList.add("");
            }
            aList.add(newList);
        }
        fill_list(root, aList, h-1, 0, w-1);
        return aList;
    }

    public int getHeight(TreeNode root){
        if(root==null)
            return 0;
        else
            return Math.max(getHeight(root.left), getHeight(root.right))+1;
    }

    public void fill_list(TreeNode root, List<List<String>> aList, int height, int start, int end){
        if(root==null) return;
        int mid = (start+end)/2;
        aList.get(hauteur-height).set(mid, ""+root.val);
        fill_list(root.left, aList, height-1, start, mid-1);
        fill_list(root.right, aList, height-1, mid+1, end);
    }
}
