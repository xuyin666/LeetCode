package DynamicProgrammation;

// 63. Unique Paths II
// A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
// The robot can only move either down or right at any point in time.
// The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
// Now consider if some obstacles are added to the grids. How many unique paths would there be?
// An obstacle and space is marked as 1 and 0 respectively in the grid.

public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] f = new int[m][n];
        f[0][0] = obstacleGrid[0][0] == 1 ? 0:1;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==0 && j==0){
                  continue;
                } else if(obstacleGrid[i][j]==1){
                    f[i][j]=0;
                }else if(i==0){
                    f[i][j] = f[i][j-1];
                }else if(j==0){
                    f[i][j] = f[i-1][j];
                }else {
                    f[i][j] = f[i][j-1] + f[i-1][j];
                }
            }
        }

        return f[m-1][n-1];
    }
}
