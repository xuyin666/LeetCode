package Tree;

// 129. Sum Root to Leaf Numbers
// Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
// An example is the root-to-leaf path 1->2->3 which represents the number 123.
// Find the total sum of all root-to-leaf numbers.
// Note: A leaf is a node with no children.

import java.util.ArrayList;
import java.util.List;

public class SumRoot2LeafNumber {
    public static int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        helper(root, list, arr);
        int sum = 0;
        for (List<Integer> toto: list){
            sum = sum + convert2int(toto);
        }
        return sum;
    }

    public static void helper(TreeNode root, List<List<Integer>> list, List<Integer> arr){
        if(root==null) return;
        if(root.right==null && root.left==null){
            arr.add(root.val);
            list.add(arr);
            return;
        }
        arr.add(root.val);
        List<Integer> leftArray = new ArrayList<>(arr);
        List<Integer> rightArray =new ArrayList<>(arr);
        helper(root.left, list, leftArray);
        helper(root.right, list, rightArray);
        return;
    }

    public static int convert2int(List<Integer> arr){
        int sum = 0;
        for(int i : arr){
            sum = sum*10+i;
        }
        return sum;
    }

    public static void main (String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode leftNode = new TreeNode(2);
        TreeNode rightNode = new TreeNode(3);
        root.left = leftNode;
        root.right = rightNode;
        System.out.println(sumNumbers(root));
    }
}
