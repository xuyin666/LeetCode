package Tree;

import java.util.ArrayList;
import java.util.List;

public class UniqueBstII {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> res = new ArrayList<>();
        if(n==0)
            return res;
        return gen(1, n);
    }


    public List<TreeNode> gen(int start, int end){

        List<TreeNode> newList = new ArrayList<>();
        List<TreeNode> newList1 = new ArrayList<>();
        List<TreeNode> res = new ArrayList<>();

        if(start>end) {
            res.add(null);
            return res;
        }

        if(start==end){
            res.add(new TreeNode(start));
            return res;
        }

        for(int i=start; i<=end; i++){
            newList = gen(start, i-1);
            newList1 = gen(i+1, end);
            for(TreeNode node: newList){
                for(TreeNode node1: newList1){
                    res.add(new TreeNode(i,node, node1));
                }
            }
        }

        return res;
    }



}
