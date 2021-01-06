package Tree;

import java.util.LinkedList;
import java.util.Queue;

// 116. Populating Next Right Pointers in Each Node
//You are given a perfect binary tree where all leaves are on the same level,
// and every parent has two children. The binary tree has the following definition:
//struct Node {
//        int val;
//        Node *left;
//        Node *right;
//        Node *next;
//        }
// Populate each next pointer to point to its next right node.
// If there is no next right node, the next pointer should be set to NULL.
// Initially, all next pointers are set to NULL.
public class PopulatingNextRRightPointer {
    public Node connect(Node root) {
        if(root==null) return null;
        Queue<Node> qNode = new LinkedList<>();
        qNode.add(root);
        while(!qNode.isEmpty()){
            int i=0;
            int qSize = qNode.size();
            Node prev = null;
            while(i<qSize){
                Node temp = qNode.remove();
                if(prev!=null){
                    prev.next = temp;
                }
                if(temp.left!=null) {
                    qNode.add(temp.left);
                }
                if(temp.right!=null){
                    qNode.add(temp.right);
                }
                i++;
                prev = temp;
                if(i==qSize)
                    temp.next = null;
            }
        }
        return root;
    }
}
