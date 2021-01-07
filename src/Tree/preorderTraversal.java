package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class preorderTraversal {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        Stack<TreeNode> nodeStack = new Stack<>();
        pushAllLeft(root, nodeStack, list);
        while(!nodeStack.isEmpty()){
            TreeNode aNode = nodeStack.pop();
            if(aNode.right!=null){
                pushAllLeft(aNode.right, nodeStack, list);
            }
        }
        return list;
    }

    public static void pushAllLeft(TreeNode aNode, Stack<TreeNode> nodeStack, List<Integer> list){
        if(aNode==null) return;
        while(aNode!=null){
            nodeStack.add(aNode);
            list.add(aNode.val);
            aNode = aNode.left;
        }
    }

    public static void main(String args[]){
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        a.left =null;
        a.right =b;
        b.right= c;
        List<Integer> list = preorderTraversal.preorderTraversal(a);
        for (Integer i: list){
            System.out.println(i);
        }
    }
}
