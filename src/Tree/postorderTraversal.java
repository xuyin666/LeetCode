package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class postorderTraversal {
//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> aList = new ArrayList<>();
//        if(root==null) return aList;
//        Stack<TreeNode> aStack = new Stack<>();
//        aStack.push(root);
//        while (!aStack.isEmpty()){
//            TreeNode aNode = aStack.pop();
//            if(aNode!=null){
//                aStack.push(aNode.left);
//                aStack.push(aNode.right);
//                aList.add(0, aNode.val);
//            }
//        }
//        return aList;
//    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> aList = new ArrayList<>();
        if(root==null) return aList;
        Stack<TreeNode> aStack = new Stack<>();
        pushAllRight(aStack, aList, root);
        while(!aStack.isEmpty()){
            TreeNode aNode = aStack.pop();
            if(aNode.left!=null){
                pushAllRight(aStack, aList, aNode.left);
            }
        }
        return aList;
    }
    public void pushAllRight(Stack<TreeNode> aStack, List<Integer> aList,TreeNode aNode){
        while(aNode!=null){
            aStack.push(aNode);
            aList.add(0, aNode.val);
            aNode = aNode.right;
        }
        return ;
    }
}
