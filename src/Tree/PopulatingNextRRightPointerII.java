package Tree;

//117. Populating Next Right Pointers in Each Node II

//Given a binary tree
//
//        struct Node {
//        int val;
//        Node *left;
//        Node *right;
//        Node *next;
//        }
//        Populate each next pointer to point to its next right node.
//        If there is no next right node, the next pointer should be set to NULL.
//        Initially, all next pointers are set to NULL.

public class PopulatingNextRRightPointerII {
    public Node connect(Node root) {
        Node curr = root;
        // head is the first node in the next layer
        Node head = null;
        // prev is the node to connect in the next layer
        Node prev = null;

        // the tree is finished
        while(curr!=null){

            // a layer is finished
            while(curr!=null){
                if(curr.left!=null){
                    if(head==null){
                        head = curr.left;
                        prev = curr.left;
                    }else{
                        prev.next = curr.left;
                        prev = prev.next;
                    }
                }
                if(curr.right!=null){
                    if(head==null){
                        head = curr.right;
                        prev = curr.right;
                    }else{
                        prev.next = curr.right;
                        prev = prev.next;
                    }
                }
                curr = curr.next;
            }
            curr = head;
            head = null;
            prev = null;
        }
        return root;
    }

}
