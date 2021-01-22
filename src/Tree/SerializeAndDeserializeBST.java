package Tree;

// 449. Serialize and Deserialize BST
// Serialization is converting a data structure or object into a sequence of bits
// so that it can be stored in a file or memory buffer,
// or transmitted across a network connection link to be reconstructed later in the same or another computer environment.

// Design an algorithm to serialize and deserialize a binary search tree.
// There is no restriction on how your serialization/deserialization algorithm should work.
// You need to ensure that a binary search tree can be serialized to a string,
// and this string can be deserialized to the original tree structure.

// The encoded string should be as compact as possible.


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SerializeAndDeserializeBST {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "";
        StringBuilder str = new StringBuilder();
        Stack<TreeNode> nodeStack = new Stack<>();
        nodeStack.add(root);
        while(!nodeStack.isEmpty()){
            TreeNode aNode = nodeStack.pop();
            str.append(aNode.val).append(",");
            if(aNode.right!=null)
                nodeStack.add(aNode.right);
            if(aNode.left!=null)
                nodeStack.add(aNode.left);
        }
        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0) return null;
        String[] numbers = data.split(",");
        Queue<Integer> nodeQueue = new LinkedList<>();
        for(String str: numbers){
            nodeQueue.add(Integer.parseInt(str));
        }
        return helper(nodeQueue);
    }

    public TreeNode helper(Queue<Integer> nodeQueue){
        if(nodeQueue.isEmpty()) return null;
        TreeNode aNode = new TreeNode(nodeQueue.remove());
        Queue<Integer> newQueue = new LinkedList<>();
        while(!nodeQueue.isEmpty() && nodeQueue.peek() < aNode.val){
            newQueue.add(nodeQueue.remove());
        }
        aNode.left = helper(newQueue);
        aNode.right = helper(nodeQueue);
        return aNode;
    }
}
