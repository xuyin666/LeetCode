package Tree;

// 606. Construct String from Binary Tree

// You need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way.
// The null node needs to be represented by empty parenthesis pair "()".
// And you need to omit all the empty parenthesis pairs
// that don't affect the one-to-one mapping relationship between the string and the original binary tree.


public class ConstructStringFromBinaryTree {
    public String tree2str(TreeNode t) {
        return helper(t);
    }

    public String helper(TreeNode t){
        if(t==null) return "";
        String left = helper(t.left);
        String right = helper(t.right);
        String result = "";
        if(left=="" && right==""){
            result = "" + t.val;
        }
        else if(left==""){
            result = t.val + "()(" + right + ")";
        }
        else if (right==""){
            result = t.val + "(" + left + ")";
        }
        else{
            result = t.val + "("+left+")("+right+")";
        }
        return result;
    }
}
