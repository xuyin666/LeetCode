package Tree;

// 508. Most Frequent Subtree Sum
// Given the root of a tree, you are asked to find the most frequent subtree sum.
// The subtree sum of a node is defined as the sum of all the node values formed by the subtree rooted at that node
// (including the node itself). So what is the most frequent subtree sum value?
// If there is a tie, return all the values with the highest frequency in any order.

import java.util.*;

public class MostFrequentSubtree {
    public int[] findFrequentTreeSum(TreeNode root) {
        List<Integer> aList = new ArrayList<>();
        HashMap<Integer, Integer> aMap = new HashMap<>();
        int[] array = aList.stream().mapToInt(i->i).toArray();
        if(root==null) return array;

        dfs(root, aMap);
        int max =0;
        for (Map.Entry<Integer, Integer> entry : aMap.entrySet()) {
            int val = entry.getValue();
            if (val>=max) {
                if(val>max){
                    max = val;
                    aList.clear();
                }
                aList.add(entry.getKey());
            }
        }
        array = aList.stream().mapToInt(i->i).toArray();
        return array;
    }

    public int dfs(TreeNode root, HashMap<Integer, Integer> aMap){
        if(root==null) return 0;
        int leftVal = dfs(root.left, aMap);
        int rightVal = dfs(root.right, aMap);
        int sum = leftVal+rightVal+ root.val;
        aMap.put(sum, aMap.getOrDefault(sum, 0)+1);
        return sum;
    }

}
