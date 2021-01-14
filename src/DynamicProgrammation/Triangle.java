package DynamicProgrammation;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
//    public int minimumTotal(List<List<Integer>> triangle) {
//        if(triangle==null) return 0;
//        return minSum(triangle,0,0);
//    }
//
//    public int minSum(List<List<Integer>> triangle, int m, int n){
//
//        int height = triangle.size();
//        if(m==height-1) return triangle.get(m).get(n);
//        else
//            return Math.min(minSum(triangle, m+1, n), minSum(triangle, m+1, n+1)) + triangle.get(m).get(n);
//    }

    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> aList = new ArrayList<>(triangle);
        int height = aList.size();
        for(int i=height-2; i>=0; i--){
            for(int j=i; j>=0; j--){
                int val = Math.min(aList.get(i+1).get(j), aList.get(i+1).get(j+1));
                aList.get(i).set(j, val+triangle.get(i).get(j));
            }
        }

        return aList.get(0).get(0);
    }
}
