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

        return helper(data);
    }

    public TreeNode helper(String data){
        int len = data.length();
        if(len==0) return null;
        TreeNode aNode = new TreeNode(data.charAt(0)-'0');
        int i;
        for(i=1; i<len; i++){
            if(data.charAt(i) > data.charAt(0)){
                break;
            }
        }
        aNode.left = helper(data.substring(1,i));
        aNode.right = helper(data.substring(i, len));
        return aNode;
    }
}
