package DynamicProgrammation;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if(i==0 && j==0){
                    arr[i][j] = grid[i][j];
                } else if(i==0){
                    arr[i][j] = arr[i][j-1] + grid[i][j];
                } else if(j==0){
                    arr[i][j] = arr[i-1][j] + grid[i][j];
                } else{
                    arr[i][j] = Math.min(arr[i-1][j], arr[i][j-1])+grid[i][j];
                }
            }

        }
        return arr[m-1][n-1];
    }
}
